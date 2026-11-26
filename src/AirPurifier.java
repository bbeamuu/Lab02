
public class AirPurifier {

    // Instance Variables
    private String brand;
    private String model;
    private boolean isOn;
    private int fanSpeed;
    private String mode;

    // Class Variables
    public static final int MAX_FAN_SPEED = 3;
    private static int totalCreated = 0;
    private static int totalOn = 0;

    // Constructor
    public AirPurifier(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isOn = false;
        this.fanSpeed = 0;
        this.mode = "Auto";

        totalCreated++;
    }

    // Instance Methods

    // Turn on the air purifier
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            totalOn++;
        }
    }

    // Turn off the air purifier
    public void turnOff() {
        if (isOn) {
            isOn = false;
            totalOn--;
            fanSpeed = 0;
        }
    }

    // Set fan speed
    public boolean setFanSpeed(int speed) {
        if (speed >= 0 && speed <= MAX_FAN_SPEED) {
            fanSpeed = speed;
            return true;
        }
        return false;
    }

    // Set operation mode
    public boolean setMode(String mode) {
        if (mode == null) {
            return false;
        }

        if (mode.equalsIgnoreCase("Auto") ||
                mode.equalsIgnoreCase("Sleep") ||
                mode.equalsIgnoreCase("Turbo")) {

            this.mode = mode;
            return true;
        }

        return false;
    }

    // Get current status
    public String getStatus() {
        return "Brand: " + brand +
                "\nModel: " + model +
                "\nPower: " + (isOn ? "ON" : "OFF") +
                "\nFan Speed: " + fanSpeed +
                "\nMode: " + mode;
    }

    // Class Methods

    public static int getTotalCreated() {
        return totalCreated;
    }

    public static int getTotalOn() {
        return totalOn;
    }

    public static int getMaxFanSpeed() {
        return MAX_FAN_SPEED;
    }
}
