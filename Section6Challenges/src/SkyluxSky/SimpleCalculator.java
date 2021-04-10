package SkyluxSky;

public class SimpleCalculator {

    //Field
    private double firstNumber = 0;
    private double secondNumber = 0;


    /*****Methods******/

    //Getters - Inputs
    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    //Getters - Operations
    public double getAdditionResults(){
        return (this.firstNumber + this.secondNumber);
    }

    public double getSubtractionResults(){
        return (this.firstNumber - this.secondNumber);
    }

    public double getMultiplicationResults(){
        return (this.firstNumber * this.secondNumber);
    }

    public double getDivisionResults(){
        if(this.secondNumber == 0){
            return 0;
        } else {
            return (this.firstNumber / this.secondNumber);
        }
    }

    public double getDivisionResultTernary(){
        // if(secondNumber==0) return 0;
        // return firstNumber/secondNumber;
        return (secondNumber==0) ? 0 : firstNumber/secondNumber; // ternary operator
    }

    //Setters
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

}
