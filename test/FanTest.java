package test;

import org.junit.jupiter.api.*;

public class FanTest {

  @Test
  void testTurnOnOff() {
    Fan fan = new Fan();
    fan.turnOn();
    fan.setSpeed(2);
    assertEquals(2, fan.getSpeed(), "The fan should be on high speed.");

    fan.turnOff();
    assertEquals(0, fan.getSpeed(), "The fan should be OFF.");
  }
}