
public class Lab02 {

    public static void main(String[] args) {

        // Create AirPurifier objects
        AirPurifier purifier1 =
                new AirPurifier("Xiaomi", "Mi Air 4");

        AirPurifier purifier2 =
                new AirPurifier("Samsung", "AX40");

        // Test purifier1
        purifier1.turnOn();
        purifier1.setFanSpeed(2);
        purifier1.setMode("Auto");

        // Test purifier2
        purifier2.turnOn();
        purifier2.setFanSpeed(3);
        purifier2.setMode("Turbo");

        // Display purifier information
        System.out.println("=== Purifier 1 ===");
        System.out.println(purifier1.getStatus());

        System.out.println("\n=== Purifier 2 ===");
        System.out.println(purifier2.getStatus());

        // Test turnOff
        purifier2.turnOff();

        System.out.println("\n=== After Turning Off Purifier 2 ===");
        System.out.println(purifier2.getStatus());

        // Display Class Variables and Methods
        System.out.println("\n=== Class Information ===");

        System.out.println("Total Created: " +
                AirPurifier.getTotalCreated());

        System.out.println("Total Currently ON: " +
                AirPurifier.getTotalOn());

        System.out.println("Maximum Fan Speed: " +
                AirPurifier.getMaxFanSpeed());
    }
}
