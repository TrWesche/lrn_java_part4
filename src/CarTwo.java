public class CarTwo extends Vehicle{
    private boolean spoiler;
    private double dragCoefficient;

    CarTwo() {
        this(false, 0.0d);
    }

    CarTwo(boolean spoiler, double dragCoefficient) {
        this("Car", 4, 4, 0.0d, 5, spoiler, dragCoefficient);
    }

    CarTwo(String brand, int qtyWheels, int qtyDoors, double power, int maxGear,  boolean spoiler, double dragCoefficient) {
        super(brand, qtyWheels, qtyDoors, power, maxGear);
        this.dragCoefficient = dragCoefficient;
        this.spoiler = spoiler;
    }
}
