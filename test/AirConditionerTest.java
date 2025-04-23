package test;

import org.junit.jupiter.api.*;

public class AirConditionerTest {
  @Test
  void testThermostatModes() {
    AirConditioner ac = new AirConditioner();
    ac.turnOn();
    ac.setThermostat("heating");
    ac.turnOff();
  }
}
