package org.example;

/**
 * Concrete implementation of {@link Source}.
 */
public class SourceImplementation implements Source {

  private int id;
  private String name;
  private boolean disabled;

  public SourceImplementation(int id, String name, boolean disabled){
    this.id = id;
    this.name = name;
    this.disabled = disabled;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean isDisabled() {
    return disabled;
  }
}
