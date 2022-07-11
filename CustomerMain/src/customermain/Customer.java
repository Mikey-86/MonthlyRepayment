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
import javax.swing.JOptionPane;

public class Customer {
    
    //Declarations
    private String customerName;
    private int contactNum;
    private int productPrice;
    private int monthNums;
    protected int monthlyRepay;
    

    //Setters and Getters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName() {
       String CustomerName = JOptionPane.showInputDialog(null, "Please enter the customer name", "Customer Name", JOptionPane.QUESTION_MESSAGE);
        this.customerName = CustomerName;
    }

    public int getContactNum() {
        return contactNum;
    }

    public void setContactNum() {
        //Assigning Joption input to temp string to convert to int
        String tempContactNum = JOptionPane.showInputDialog(null, "Please enter the customer contact number", "Customer Contact", JOptionPane.QUESTION_MESSAGE);
        contactNum = Integer.parseInt(tempContactNum);       
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice() {
        //Assigning Joption input to temp string to convert to int
        String tempProductPrice = JOptionPane.showInputDialog(null, "Please enter the price of the product", "Product Price", JOptionPane.QUESTION_MESSAGE);
        productPrice = Integer.parseInt(tempProductPrice);
    }

    public int getMonthNums() {
        return monthNums;
    }

    public void setMonthNums() {
        //Assigning Joption input to temp string to convert to int
        String tempMonthNums = JOptionPane.showInputDialog(null, "Please enter the number of repayment months", "Number of Months", JOptionPane.QUESTION_MESSAGE);
        monthNums= Integer.parseInt(tempMonthNums);
    }
    
    
    public void calculate_repayment(String Name, int contactNumber, int productAmount, int numOfMonths){
        //Declarations
        double repaymentAmount;
        
        //Calculations
        repaymentAmount = productAmount/numOfMonths;
        
        //Displaying data
        JOptionPane.showMessageDialog(null, "Customer name: " + Name +"\n"+ 
                                                        "Customer number: " + contactNumber + "\n" +
                                                        "Product amount: " + productAmount + "\n" +
                                                        "Repayment months " + numOfMonths + "\n" +
                                                        "Monthly repayment: " + repaymentAmount + "\n" +
                                                        "Total due: " + productAmount,  
                                                        "Message", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
