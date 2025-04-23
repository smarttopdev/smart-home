package test;

import org.junit.jupiter.api.*;

public class SmartHomeSystemTest {
  @Test
  void testTurnOffAllDevices() {
    SmartHomeSystem system = new SmartHomeSystem();
    system.turnOffAllAppliances();
  }
}
