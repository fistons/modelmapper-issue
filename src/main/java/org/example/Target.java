package org.example;

/**
 * Target class, instantiated by the Converter
 */
public class Target {

  private int newId;
  private String newNameInUpperCase;
  private boolean enable;

  // This constructor shouldn't even be called since we rely on the all arguments constructor in the Converter
  public Target() {
  }

  public Target(int id, String newNameInUpperCase, boolean enable) {
    this.newId = id;
    this.newNameInUpperCase = newNameInUpperCase;
    this.enable = enable;
  }

  public int getNewId() {
    return newId;
  }

  public void setNewId(int newId) {
    this.newId = newId;
  }

  public String getNewNameInUpperCase() {
    return newNameInUpperCase;
  }

  public void setNewNameInUpperCase(String newNameInUpperCase) {
    this.newNameInUpperCase = newNameInUpperCase;
  }

  public boolean isEnable() {
    return enable;
  }

  public void setEnable(boolean enable) {
    this.enable = enable;
  }
}
