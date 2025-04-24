package test;

import org.junit.jupiter.api.*;

public class LightTest {

  @Test
  void testTurnOnOff() {
    Light light = new Light();
    light.turnOn();
    assertTrue(light.isOn(), "The light should be ON.");

    light.turnOff();
    assertFalse(light.isOn(), "The light should be OFF.");
  }
}