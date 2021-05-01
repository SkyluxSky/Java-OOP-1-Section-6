package SkyluxSky;

public class Main {

    public static void main(String[] args) {
        //Initializes Animal Class - Not Specific.
        Animal animal = new Animal("Animal",1,1,5,5);

        //Initialize Dog - Specific
        Dog dog = new Dog("Husky",6,25,2,4,1,45,"White");
        //Calls eat from animal class.
        dog.eat();
    }
}
