package SkyluxSky;

public class Person {
    //field
    private String firstName;
    private String lastName;
    private int age;

    //methods
    //getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    //setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen(){
        return age >= 12 && age <= 20;
    }



}
