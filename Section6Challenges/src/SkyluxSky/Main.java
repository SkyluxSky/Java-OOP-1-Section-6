package SkyluxSky;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResults());

        Cuboid cube = new Cuboid(3.2,3.4,3);
        System.out.println("Total Volume: " + cube.getVolume());

    }
}
