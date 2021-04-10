package SkyluxSky;

/**
 * Public means unrestricted access to the class
 *
 * Private means no other class can access that class
 *
 * Protected means that only classes in this package can access this class
 *
 * Or no access modifier at all works
 */

public class Car {
    /*Class or member fields - commonly known as fields (Variables that can be accessed anywhere within the class)
    *
    * Fields are private to support the idea of encapsulation.
    * Encapsulation allows us to hide the methods and fields in our program from public access. aka. outside the class.
    */

    //State components of a car - Car characteristics
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //IntelliJ will automatically recommend method names
    //No use of static keyword
    //Setter
    public void setModel(String model){
        String validModel = model.toLowerCase();

        //Validation prevents the class from creating an invalid output
        if(validModel.equals("911 gt") || validModel.equals("a4")){
            //This keyword refers to the field in the class
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    //Getter
    public String getModel(){
        return this.model;
    }

}
