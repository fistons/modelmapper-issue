package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

public class ModelMapperTest {

  private ModelMapper mapper;

  @BeforeEach
  public void before() {
    mapper = new ModelMapper();
    mapper.getConfiguration().setImplicitMappingEnabled(false);

    // Add a converter to map a Source implementation to Target
    mapper.addConverter(new SourceTargetConverter());
    // Add a converter to map a SourceAsClass implementation to Target
    mapper.addConverter(new SourceAsClassTargetConverter());
  }
  @Test
  public void test_implementationInTest() {

    // Implementing the Source interface directly in the unit tests
    Source source = new Source() {
      @Override
      public int getId() {
        return 42;
      }

      @Override
      public String getName() {
        return "hello";
      }

      @Override
      public boolean isDisabled() {
        return true;
      }
    };

    Target target = mapper.map(source, Target.class);

    Assertions.assertEquals(52, target.getNewId());
    Assertions.assertEquals("HELLO", target.getNewNameInUpperCase());
    Assertions.assertEquals(false, target.isEnable());
  }

  @Test
  public void test_interfaceImplementation() {

    // Using a concrete class
    SourceImplementation source = new SourceImplementation(42, "hello", true);

    Target target = mapper.map(source, Target.class);

    Assertions.assertEquals(52, target.getNewId());
    Assertions.assertEquals("HELLO", target.getNewNameInUpperCase());
    Assertions.assertEquals(false, target.isEnable());
  }

  @Test
  public void test_sourceAsClass() {

    // Using a concrete class
    SourceAsClass source = new SourceAsClass(42, "hello", true);

    Target target = mapper.map(source, Target.class);

    Assertions.assertEquals(52, target.getNewId());
    Assertions.assertEquals("HELLO", target.getNewNameInUpperCase());
    Assertions.assertEquals(false, target.isEnable());
  }
}
