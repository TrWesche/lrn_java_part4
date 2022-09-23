public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car ford = new Car();
//
//        porsche.setModel("Carerra GT");
//        System.out.println(porsche.getModel());
//
//
//        Account accountOne = new Account(
//                1, 100.0d, "FirstName1", "LastName1",
//                "first.last@email.com", "123-456-7890");
//
//        System.out.println(accountOne.getBalance());
//
//        Account accountDefault = new Account();
//
//        System.out.println(accountDefault.getFirstName());

//        Animal animal1 = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog1 = new Dog("Aussie", 5, 50, 4, 2, 1, 1, "long straight");
//        dog1.eat();
//
//        dog1.walk();

        FordCar mustang = new FordCar(2, 450, 7, true, 0.35);

        mustang.imAFordCar();
        mustang.shiftUp();
        mustang.shiftUp();
        mustang.shiftDown();
        mustang.move();

    }

}
