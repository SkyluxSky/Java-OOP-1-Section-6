package SkyluxSky;

public class Main {

    public static void main(String[] args) {
        //initiate constructor
	    BankAccount myAccount = new BankAccount();//"12345", 0.00, "Cameron",
                //"cam@gmail.com","(000) 000-0000");//Calls constructor

        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getCustomerPhoneNumber());
	    myAccount.withdrawal(100.0);
	    myAccount.deposit(50.0);
	    myAccount.withdrawal(100.0);
        myAccount.withdrawal(10.0);

        myAccount.deposit(51.0);
        myAccount.withdrawal(30.0);

        //Override Constructor - Constructor With 3 Parameters
        BankAccount camAccount = new BankAccount("Cam","Email","00000000");
        System.out.println(camAccount.getNumber() + " name " + camAccount.getCustomerName());

        //Challenge - test three overriding constructors
        VipCustomer vipPerson = new VipCustomer();
        System.out.println(vipPerson.getName());

        VipCustomer vipPerson2 = new VipCustomer("Bob",250000.00);
        System.out.println(vipPerson2.getName());

        VipCustomer vipPerson3 = new VipCustomer("Cam",250000.00, "email");
        System.out.println(vipPerson3.getName());

    }
}
