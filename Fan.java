
public class Fan implements Appliance {
    private int speed = 0;

    @Override
    public void turnOn() {
        speed = 1;
        System.out.println("Fan is turned ON at speed " + speed);
    }

    @Override
    public void turnOff() {
        speed = 0;
        System.out.println("Fan is turned OFF.");
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 2) {
            this.speed = speed;
            System.out.println("Fan speed set to " + speed);
        } else {
            System.out.println("Invalid speed.");
        }
    }
}
