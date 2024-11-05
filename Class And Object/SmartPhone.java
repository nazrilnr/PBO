public class SmartPhone {
    public String brand;
    public String model;
    public int batteryCapacity;
    public String operatingSystem;
    public float screenSize;

    public void powerON() {
        System.out.println(model + " is now ON.");
    }

    public void powerOFF() {
        System.out.println(model + " is now OFF.");
    }

    public void photo() {
        System.out.println("Taking a photo with " + model);
    }

    public void calling(String nomor) {
        System.out.println("Calling " + nomor + " from " + model);
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}
