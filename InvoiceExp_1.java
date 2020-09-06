import java.io.*;
import java.util.Scanner;
class Invoice{
        //Define instance variables here
        private String partNumber;
        private String partDescription;
        private int quantity;
        private double price;
        
       public Invoice(){ }
        //Define parameterized constructor here
        public Invoice(String partNumber,String partDescription,int quantity,double price){
            this.partNumber=partNumber;
            this.partDescription=partDescription;
            this.quantity=quantity;
            this.price=price;
        }
       // Setters
       public void setPartNumber(String partNumber){
           this.partNumber=partNumber;
       }
       
       public void setPartDescription(String partDescription){
           this.partDescription=partDescription;
       }
       
       public void setQuantity(int quantity){
           this.quantity=quantity;
       }
     
       public void setPrice(double price){
           this.price=price;
       }

       // Getters
       public String getPartNumber(){
           return(partNumber);
       }
       
       public String getPartDecription(){
           return(partDescription);
       }
       
       public int getQuantity(){
           return(quantity);
       }
       
       public double getPrice(){
           return(price);
       }

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                if(price<0){
                    price=0;
                }
                if(quantity<0){
                    quantity=0;
                }
                invoiceAmount = price*quantity;
                return invoiceAmount;
       }
}
public class InvoiceExp_1{
         public static void main(String []args){
                   Invoice myInvoice;
                   int test=InvoiceTest();
                   if(test==0){
                       System.out.println("INVOICE GENERATED");
                   }
         }
         public static int InvoiceTest(){
             Invoice myInvoice = new Invoice("mouse1","used for..",12,577.789);
             System.out.println("partNumber"+" "+"partDescription"+" "+"quantity"+" "+"price_per_unit"+" "+"totalammount");
             System.out.println(".........................................................................................");
             System.out.print(myInvoice.getPartNumber()+"     "+myInvoice.getPartDecription()+"     "+myInvoice.getQuantity()+"     "+myInvoice.getPrice()+"     "+myInvoice.getInvoiceAmount());
             System.out.println();
             return(0);
         }
}
