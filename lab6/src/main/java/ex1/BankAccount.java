package ex1;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        System.out.println(amount+"dollars withdrew.");
    }

    public void deposit(double amount){
        System.out.print(amount+"dollars deposited.");
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof BankAccount){
            BankAccount b=(BankAccount) obj;
            return (this.owner.equals(((BankAccount) obj).getOwner()) && balance == b.balance);
        }
        return false;
    }


}
