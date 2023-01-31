package org.example;

import org.modelmapper.AbstractConverter;

public class SourceTargetConverter extends AbstractConverter<Source, Target> {
  @Override
  protected Target convert(Source source) {
    return new Target(source.getId() + 10, source.getName().toUpperCase(), !source.isDisabled());
  }
}
