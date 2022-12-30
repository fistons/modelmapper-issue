package org.example;

import org.modelmapper.AbstractConverter;

public class SourceTargetConverter extends AbstractConverter<Source, Target> {
  @Override
  protected Target convert(Source source) {
    return new Target(source.getId(), source.getName(), source.isDisabled());
  }
}
