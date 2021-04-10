package SkyluxSky;

public class Main {

    //Objects have two characteristics States(Alive,Age,Etc...) and Behaviors(Eating,Booting Up,Sleeping,Etc...)
    //Classes are a template for objects.
    public static void main(String[] args) {

        //create an object and initialize it.
        Car porsche = new Car();
        Car audi = new Car();

        //null is the default state for a String
        //System.out.println("Model is " + porsche.getModel());
        //all initialized classes inherit methods from a base java class
        porsche.setModel("911 GT");
        System.out.println("Model is " + porsche.getModel());


    }
}
