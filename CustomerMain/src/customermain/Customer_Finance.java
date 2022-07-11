/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermain;

/**
 *
 * @author Michael Francke 19013267
 */
public class Customer_Finance {
    
    //Declarations
    Customer Cus1 = new Customer();
    Finance_Period Customer1 = new Finance_Period();
    
    //Method to accept user values 
    public void userVals(){
        
        //Setting Customer class private variables
        Cus1.setCustomerName();
        Cus1.setContactNum();
        Cus1.setProductPrice();
        Cus1.setMonthNums();
        
        //Setting Finance_Period variables
        Customer1.setMonthInterestAmount();
        Customer1.setMonthMaxAmount();
        Customer1.setInterest();
        
        
        //Method call to determine if interest must be added and then sends data to the correct method to display repayment amounts 
        Customer1.calcInterest(Cus1.getCustomerName(), Cus1.getContactNum(), Cus1.getProductPrice(), Cus1.getMonthNums());
    
    }
    
}
