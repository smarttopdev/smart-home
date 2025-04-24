
public class AirConditioner implements Appliance {
    private ACMode mode = ACMode.OFF; // Default mode is off

    @Override
    public void turnOn() {
        mode = ACMode.COOLING; // Default to cooling mode when turned on
        System.out.println("Air Conditioner is turned ON in " + mode.getMode() + " mode.");
    }

    @Override
    public void turnOff() {
        mode = ACMode.OFF;
        System.out.println("Air Conditioner is turned OFF.");
    }

    public void setThermostat(ACMode mode) {
        this.mode = mode;
        System.out.println("Air Conditioner mode set to " + mode.getMode());
    }

    public ACMode getMode() {
        return mode;
    }
}
