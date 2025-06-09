package BankManagementSystem;

public class BankAccount {
// Declaring attributes
    String name;
    int acctNo;
    double balance;
    String city;
    boolean acctType;

// Constructor
public BankAccount(String name, int acctNo, double balance, String city, boolean acctType){
    this.name=name;
    this.acctNo=acctNo;
    this.balance=balance;
    this.city=city;
    this.acctType=acctType;
}

//    public BankAccount() {
//
//    }

    // Methods
void deposit(double amount){
    balance+=amount;
    System.out.println("Amount of Rs." + amount +" is deposited successfully");
}

void withdraw(double amount){
    if(amount>balance){
        System.out.println("Insufficient fund");
        return;
    }
    balance -= amount;
    System.out.println("The amount of Rs. "+amount+ "withdrawn successfully");
}

void viewBalance(){
    System.out.println("The balance is: "+balance);
}

void showDetails(){
    System.out.println("Account holder name: "+name);
    System.out.println("Account number: "+acctNo);
    System.out.println("City: "+city);
    System.out.println("Account type: "+(acctType ? "Savings":"Current")); //If acctType is true, then return "Saving" Else return "Current"
    System.out.println("Current balance: "+balance);

}

}
