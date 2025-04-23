package test;

import org.junit.jupiter.api.*;

public class FanTest {
  @Test
  void testSpeedChange() {
    Fan fan = new Fan();
    fan.turnOn();
    fan.setSpeed(2);
    fan.turnOff();
  }
}
