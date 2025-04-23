
import java.util.ArrayList;
import java.util.List;

public class SmartHomeSystem {
    private List<Appliance> appliances = new ArrayList<>();

    public SmartHomeSystem() {
        appliances.add(new Light());
        appliances.add(new Fan());
        appliances.add(new AirConditioner());
    }

    public void turnOffAllAppliances() {
        for (Appliance appliance : appliances) {
            appliance.turnOff();
        }
        System.out.println("[System] All appliances OFF for yearly update.");
    }

    public static void main(String[] args) {
        SmartHomeSystem system = new SmartHomeSystem();
        SystemUpdateScheduler.scheduleYearlyUpdate(system);

        System.out.println("Smart Home System initialized.");
    }
}
