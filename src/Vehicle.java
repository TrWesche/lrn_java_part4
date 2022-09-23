public class Vehicle {
    private String brand;
    private int qtyWheels;
    private int qtyDoors;
    private double power;

    private int maxGear;

    private int currentGear;

    Vehicle() {
        this("Unknown", 0, 0, 0.0d, 0);
    }

    Vehicle(String brand, int qtyWheels, int qtyDoors, double power, int maxGear) {
        this.brand = brand;
        this.qtyWheels = qtyWheels;
        this.qtyDoors = qtyDoors;
        this.power = power;
        this.maxGear = maxGear;
        this.currentGear = 0;
    }

    void steer (String direction) {
        System.out.println("Turned " + direction);
    }

    void shiftUp () {
        if (currentGear < maxGear) {
            currentGear++;
            System.out.println("Shift Up, now in gear " + currentGear);
        }
    }

    void shiftDown () {
        if (currentGear > 0) {
            currentGear--;
            System.out.println("Shift Down, now in gear " + currentGear);
        }
    }

    void move () {
        System.out.println("Hey, I'm walkin' here!");
    }
}
