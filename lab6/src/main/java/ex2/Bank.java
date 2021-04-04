package ex2;

import ex1.BankAccount;

import java.util.*;

public class Bank {
    private final ArrayList<BankAccount> accounts;

    public Bank(){
        this.accounts=new ArrayList<>();
    }

    public void addAccount(String owner, double balance){
        accounts.add(new BankAccount(owner, balance));
    }

    public void printAccounts(){
        accounts.sort(Comparator.comparingDouble(BankAccount::getBalance));
        System.out.println(Arrays.deepToString(accounts.toArray()));
    }

    public void printAccounts(double minBalance, double maxBalance){
        accounts.sort(Comparator.comparingDouble(BankAccount::getBalance));
        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).getBalance()> minBalance && accounts.get(i).getBalance()< maxBalance)
                System.out.println(accounts.get(i).toString());
        }
    }


    public BankAccount getAccount(String owner){
        for(int i=0; i<accounts.size(); i++){
            if (accounts.get(i).getOwner().equals(owner))
                return accounts.get(i);
        }
        return null;
    }

    public ArrayList<BankAccount> getAllAccounts(){
        return accounts;
    }



}
