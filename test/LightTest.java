package test;

import org.junit.jupiter.api.*;

public class LightTest {
  @Test
  void testTurnOnOff() {
    Light light = new Light();
    light.turnOn();
    light.turnOff();
  }
}
