
public class AirConditioner implements Appliance {
    private String mode = "off";

    @Override
    public void turnOn() {
        mode = "cooling";
        System.out.println("AC is turned ON in " + mode + " mode.");
    }

    @Override
    public void turnOff() {
        mode = "off";
        System.out.println("AC is turned OFF.");
    }

    public void setThermostat(String mode) {
        if (mode.equals("off") || mode.equals("cooling") || mode.equals("heating")) {
            this.mode = mode;
            System.out.println("AC mode set to " + mode);
        } else {
            System.out.println("Invalid mode.");
        }
    }
}
