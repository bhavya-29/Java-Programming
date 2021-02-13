import java.io.*;
import java.util.Scanner;
class SavingsAccount{
    static double annualInterestsRate = 0.04;
    private double savingsBalance;
    
    public SavingsAccount(){}
    
    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    
    public void setBalance(double savingsBalance){
        this.savingsBalance=savingsBalance;
    }
    
    public double getBalance(){
        return(savingsBalance);
    }
    
    
}
public class Expt3{
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        double newBalance1 = saver1.getBalance()+calculateMonthlyInterest(saver1.getBalance(),saver1.annualInterestsRate);
        double newBalance2 =saver2.getBalance()+calculateMonthlyInterest(saver2.getBalance(),saver2.annualInterestsRate);
        System.out.println("New Balance of saver1 : "+newBalance1);
        System.out.println("New Balance of saver2 : "+newBalance2);
        saver1.setBalance(newBalance1);
        saver2.setBalance(newBalance2);
        modifyInterestRate(saver1.annualInterestsRate);
        modifyInterestRate(saver2.annualInterestsRate);
        newBalance1 =saver1.getBalance()+calculateMonthlyInterest(saver1.getBalance(),saver1.annualInterestsRate);
        newBalance2 =saver2.getBalance()+calculateMonthlyInterest(saver2.getBalance(),saver2.annualInterestsRate);
        System.out.println("New Balance of saver1 : "+newBalance1);
        System.out.println("New Balance of saver2 : "+newBalance2);

    }
    public static double calculateMonthlyInterest(double sav_bal,double interest_rate){
        double monthly_interest=0.0;
        monthly_interest = (sav_bal*interest_rate)/12;
        return(monthly_interest);
    }
    
    public static double modifyInterestRate(double interest_rate){
        interest_rate=0.05;
        return(interest_rate);
    }
}
