public class FordCar extends CarTwo {
    FordCar(int qtyDoors, double power, int maxGear,  boolean spoiler, double dragCoefficient) {
        super("Ford", 4, qtyDoors, power, maxGear, spoiler, dragCoefficient);
    }

    void imAFordCar () {
        System.out.println("Hey... I'm a Ford.");
    }
}
