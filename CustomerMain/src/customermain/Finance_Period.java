/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermain;

import javax.swing.JOptionPane;

/**
 *
 * @author Michael Francke 19013267
 */
public class Finance_Period extends Customer{
    
    //Declarations
    
    private int monthMaxAmount;
    private int monthInterestAmount;
    private double interest;
    
    //Getters and setters

    public int getMonthMaxAmount() {
        return monthMaxAmount;
    }

    public void setMonthMaxAmount() {
        monthMaxAmount = 12;
    }

    public int getMonthInterestAmount() {
        return monthInterestAmount;
    }

    public void setMonthInterestAmount() {
        monthInterestAmount = 3;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest() {
        interest = 0.25;
    }
            
        
    //Method to calculate if interest rate applied
    
    public void calcInterest(String Name, int contactNumber, int productAmount, int numOfMonths){
        if(numOfMonths > getMonthInterestAmount() && numOfMonths <= getMonthMaxAmount()){
           
            //This is if months is determined greater than 3 months and less than 12
            //This is the overidden method that is being called
            calculate_repayment(Name, contactNumber, productAmount, numOfMonths);
            
        }
        
        else{
            
            //This method is the base class method being called to            
            super.calculate_repayment(Name, contactNumber, productAmount, numOfMonths);
            
        }           
    }
    
    
    //Overidden Customer method to calculate and display interest added total
    @Override
    public void calculate_repayment(String Name, int contactNumber, int productAmount, int numOfMonths){
       //Declarations
        double total;
        double repaymentAmount;
        
        //Calculations
        total = (productAmount +(productAmount * getInterest()));
        repaymentAmount = total / numOfMonths;
        
        //Displaying data
        JOptionPane.showMessageDialog(null, "Customer name: " + Name + "\n"+
                                                        "Customer number: " + contactNumber +"\n"+
                                                        "Product amount: " + productAmount + "\n"+
                                                        "Repayment months " + numOfMonths +"\n"+
                                                        "Monthly repayment: " + repaymentAmount + "\n"+
                                                        "Total due: " + total, 
                                                        "Message", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
