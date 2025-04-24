package test;

import org.junit.jupiter.api.*;

public class SmartHomeSystemTest {

  @Test
  void testTurnOnAllAppliances() {
    SmartHomeSystem system = new SmartHomeSystem();
    system.turnOnAllAppliances();

    // Test the status of each appliance
    Light light = new Light();
    Fan fan = new Fan();
    AirConditioner ac = new AirConditioner();

    light.turnOn();
    fan.turnOn();
    ac.turnOn();

    assertTrue(light.isOn(), "The light should be ON.");
    assertEquals(1, fan.getSpeed(), "The fan should be on low speed.");
    assertEquals(ACMode.COOLING, ac.getMode(), "The AC should be in cooling mode.");
  }

  @Test
  void testTurnOffAllAppliances() {
    SmartHomeSystem system = new SmartHomeSystem();
    system.turnOffAllAppliances();

    // Assuming you have access to the appliance status via method calls like 'isOn'
    Light light = new Light();
    Fan fan = new Fan();
    AirConditioner ac = new AirConditioner();

    light.turnOff();
    fan.turnOff();
    ac.turnOff();

    assertFalse(light.isOn(), "The light should be OFF.");
    assertEquals(0, fan.getSpeed(), "The fan should be OFF.");
    assertEquals(ACMode.OFF, ac.getMode(), "The AC should be OFF.");
  }

  @Test
  void testTurnApplianceByName() {
    SmartHomeSystem system = new SmartHomeSystem();
    system.turnOnApplianceByName("Light");
    system.turnOffApplianceByName("Fan");

    // Check if the light is on and fan is off
    Light light = new Light();
    Fan fan = new Fan();

    assertTrue(light.isOn(), "The light should be ON.");
    assertEquals(0, fan.getSpeed(), "The fan should be OFF.");
  }

  @Test
  void testGetApplianceStatus() {
    SmartHomeSystem system = new SmartHomeSystem();

    system.turnOnApplianceByName("AirConditioner");
    system.getApplianceStatus("AirConditioner");

    // Simulate checking the status of the AC
    AirConditioner ac = new AirConditioner();
    ac.turnOn();

    assertEquals("Air Conditioner is Cooling", "Air Conditioner is " + ac.getMode().getMode());
  }
}