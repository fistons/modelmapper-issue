package org.example;

/**
 * Target class, instantiated by the Converter
 */
public class Target {

  private int id;
  private String name;
  private boolean disabled;

  // This constructor shouldn't even be called since we rely on the all arguments constructor in the Converter
  public Target() {
  }

  public Target(int id, String name, boolean disabled) {
    this.id = id;
    this.name = name;
    this.disabled = disabled;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(boolean disabled) {
    this.disabled = disabled;
  }
}
