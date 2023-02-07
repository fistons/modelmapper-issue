package org.example;

import org.modelmapper.AbstractConverter;

public class SourceAsClassTargetConverter extends AbstractConverter<SourceAsClass, Target> {
  @Override
  protected Target convert(SourceAsClass source) {
    return new Target(source.getId() + 10, source.getName().toUpperCase(), !source.isDisabled());
  }
}
