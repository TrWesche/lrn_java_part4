public class Dog extends Animal {
    private int legs;
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int legs, int eyes, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    public void walk() {
        System.out.println("Dog walked");
        move(5);
    }

    public void run() {
        System.out.println("Dog ran");
        move(10);
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }


}
