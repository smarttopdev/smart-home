
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
        System.out.println("All appliances have been turned OFF.");
    }

    public void turnOnAllAppliances() {
        for (Appliance appliance : appliances) {
            appliance.turnOn();
        }
        System.out.println("All appliances have been turned ON.");
    }

    public void turnOnApplianceByName(String applianceName) {
        for (Appliance appliance : appliances) {
            if (appliance.getClass().getSimpleName().equalsIgnoreCase(applianceName)) {
                appliance.turnOn();
                System.out.println(applianceName + " has been turned ON.");
                return;
            }
        }
        System.out.println("Appliance " + applianceName + " not found.");
    }

    public void turnOffApplianceByName(String applianceName) {
        for (Appliance appliance : appliances) {
            if (appliance.getClass().getSimpleName().equalsIgnoreCase(applianceName)) {
                appliance.turnOff();
                System.out.println(applianceName + " has been turned OFF.");
                return;
            }
        }
        System.out.println("Appliance " + applianceName + " not found.");
    }

    public void getApplianceStatus(String applianceName) {
        for (Appliance appliance : appliances) {
            if (appliance.getClass().getSimpleName().equalsIgnoreCase(applianceName)) {
                String status = appliance instanceof AirConditioner
                        ? "Air Conditioner is " + ((AirConditioner) appliance).getMode().getMode()
                        : appliance instanceof Light && ((Light) appliance).isOn() ? "ON" : "OFF";
                System.out.println(applianceName + " is " + status);
                return;
            }
        }
        System.out.println("Appliance " + applianceName + " not found.");
    }

    public static void main(String[] args) {
        SmartHomeSystem system = new SmartHomeSystem();
        SystemUpdateScheduler.scheduleYearlyUpdate(system);

        System.out.println("Smart Home System initialized.");
    }
}
