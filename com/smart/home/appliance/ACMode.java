package com.smart.home.appliance;

public enum ACMode {
  OFF("Off"),
  COOLING("Cooling"),
  HEATING("Heating");

  private final String mode;

  ACMode(String mode) {
    this.mode = mode;
  }

  public String getMode() {
    return mode;
  }
}
