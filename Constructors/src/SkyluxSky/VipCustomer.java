package SkyluxSky;

public class VipCustomer {
    //Fields
    private String name;
    private double creditLimit;
    private String emailAddress;

    //Constructor
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "email@gmail.com");
    }

    public VipCustomer() {
        this("Default Name", 100.0, "Default Email");
    }

    //Methods
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
