package SkyluxSky;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    //Initiates the floor and carpet classes.
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return (floor.getArea() * carpet.getCost());
    }
}
