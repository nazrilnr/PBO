public class DemoSP {
    public static void main(String[] args) {
        System.out.println("");
        SmartPhone phone1 = new SmartPhone();
        phone1.brand = "Apple";
        phone1.model = "iPhone 13";
        phone1.batteryCapacity = 3240;
        phone1.operatingSystem = "iOS";
        phone1.screenSize = 6.1f;

        SmartPhone phone2 = new SmartPhone();
        phone2.brand = "Samsung";
        phone2.model = "Galaxy S21";
        phone2.batteryCapacity = 4000;
        phone2.operatingSystem = "Android";
        phone2.screenSize = 6.2f;

        System.out.println("Smartphone 1:");
        phone1.displayInfo();
        phone1.powerON();
        phone1.calling("08123456789");
        phone1.photo();
        phone1.powerOFF();

        System.out.println();

        System.out.println("Smartphone 2:");
        phone2.displayInfo();
        phone2.powerON();
        phone2.calling("08567891234");
        phone2.photo();
        phone2.powerOFF();

        System.out.println("");
    }
}
