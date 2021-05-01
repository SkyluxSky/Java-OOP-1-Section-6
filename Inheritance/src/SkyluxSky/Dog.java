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

    //Override move method
    @Override
    public void move(int speed) {
        System.out.println("Dog.move Called.");
        moveLegs(speed);
        //calls original move method
        super.move(speed);
    }

    public void walk(){
        System.out.println("Dog.walk Called.");
        //Does not call Dog.move()
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run Called.");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs Called.");
    }


}