package org.example;

/**
 * Source, but as a class, not interface, to be mapped to {@link Target}
 */
public class SourceAsClass {

  private int id;
  private String name;
  private boolean disabled;

  public SourceAsClass(int id, String name, boolean disabled) {
    this.id = id;
    this.name = name;
    this.disabled = disabled;
  }

  public boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(boolean disabled) {
    this.disabled = disabled;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
