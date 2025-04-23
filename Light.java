public class Light implements Appliance {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light is turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light is turned OFF.");
    }
}
