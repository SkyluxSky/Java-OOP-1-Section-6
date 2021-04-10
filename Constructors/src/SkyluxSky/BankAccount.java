package SkyluxSky;

public class BankAccount {
    //fields
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //Constructors set the initial value of a field
    public BankAccount(){
        //calls another constructor to place default values.
        //To call another constructor in an empty constructor, it must be the first line!
        this("000000", 0.00, "Default Name", "Default Address", "Default Phone");
        System.out.println("Empty constructor called");
    }

    //Primary constructor
    //Overloaded Constructor
    public BankAccount(String number, double balance,String customerName
            ,String customerEmailAddress, String customerPhoneNumber){

        System.out.println("Account Constructor with parameters called\n");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    //Constructors can be automatically created in code generate drop down
    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",100.55,customerName,customerEmailAddress,customerPhoneNumber);
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



    //Method
    //to automate getters and setters go to code menus and hit generate
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        //Checks if value is less than zero.
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed!");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance: " + this.balance);
        }
    }

    //Getter
    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    //Setter
    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
