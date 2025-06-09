package BankManagementSystem;

import java.util.ArrayList;

public class Bank {
    //store all accounts into ArrayList
    ArrayList<BankAccount> accounts = new ArrayList<>();

    public void createAccount(String name, int acctNo, double balance, String city, boolean acctType) {
        BankAccount acct = new BankAccount(name, acctNo, balance, city, acctType);
        accounts.add(acct);
    }

    public void depositToAcct(int acctNo, double amount) {
        boolean found = false;
        for (BankAccount acc : accounts) {
            if (acc.acctNo == acctNo) {
                acc.deposit(amount);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found");
        }
    }

    public void withdrawFromAcct(int acctNo, double amount) {
        boolean found = false;
        for (BankAccount acc : accounts) {
            if (acc.acctNo == acctNo) {
                acc.withdraw(amount);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found");
        }

    }

    public void showBalance(int acctNo) {
        boolean found = false;
        for (BankAccount acc : accounts) {
            if (acc.acctNo == acctNo) {
                acc.viewBalance();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Account not found");
        }
    }

        public void showAcctDetails ( int acctNo){
            boolean found = false;
            for (BankAccount acc : accounts) {
                if (acc.acctNo == acctNo) {
                    acc.showDetails();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Account not found");
            }

        }
    }


