package test;

import org.junit.jupiter.api.*;

public class AirConditionerTest {

  @Test
  void testTurnOnOff() {
    AirConditioner ac = new AirConditioner();
    ac.turnOn();
    assertEquals(ACMode.COOLING, ac.getMode(), "The AC should be in cooling mode when turned ON.");

    ac.turnOff();
    assertEquals(ACMode.OFF, ac.getMode(), "The AC should be OFF when turned OFF.");
  }

  @Test
  void testSetThermostat() {
    AirConditioner ac = new AirConditioner();
    ac.setThermostat(ACMode.HEATING);
    assertEquals(ACMode.HEATING, ac.getMode(), "The AC mode should be set to heating.");
  }
}