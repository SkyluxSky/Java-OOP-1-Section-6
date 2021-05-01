package SkyluxSky;

//extends keyword - Allows us to extend the behavior of the class to the animal class.
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Constructor for dog calls animal constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //super = calls the constructor of the class we are extending from.
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() Called.");
    }

    //Override - Methods can be made unique for separate classes
    @Override
    public void eat() {
        System.out.println("Dog.eat Called.");
        chew();
        //calls super equivalent of that class -calls animal eat method
        super.eat();
    }
}