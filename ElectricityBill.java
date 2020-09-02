import java.io.*;
import java.util.Scanner;
class Bill{
        private String name;
        private int number;
        private double previous_month_reading;
        private double current_month_reading;
        private String connection_type;
        
        public Bill(){ }
        
        public Bill(String name,int number,double previous_month_reading,double current_month_reading,String connection_type){
            this.name=name;
            this.number=number;
            this.previous_month_reading=previous_month_reading;
            this.current_month_reading=current_month_reading;
            this.connection_type=connection_type;
        }
       // Setters
       public void setName(String name){
           this.name=name;
       }
       
       public void setNumber(int number){
           this.number=number;
       }
       
       public void setBeforeReading(double previous_month_reading){
           this.previous_month_reading=previous_month_reading;
       }
        
       public void setNowReading(double current_month_reading){
           this.current_month_reading=current_month_reading;
       }
       
       public void setType(String connection_type){
           this.connection_type=connection_type;
       }
       
       public String getName(){
           return(name);
       }
       
       public int getNumber(){
           return(number);
       }
       
       public double getBeforeReading(){
           return(previous_month_reading);
       }
       
       public double getNowReading(){
           return(current_month_reading);
       }
       
       public String getType(){
           return(connection_type);
       }
           
       public double getTotalBill(){
           double reading=current_month_reading-previous_month_reading;
           double totalbill=0.0;
           if(connection_type=="DOMESTIC"){
               if(reading<=100){
                   totalbill=reading*1;
               }
               else if(reading>100 && reading<=200){
                   totalbill=reading*(2.50);
               }
               else if(reading>200 && reading<=500){
                   totalbill=reading*4;
               }
               else{
                   totalbill=reading*(6);
               }
           }
           else{
               if(reading<=100){
                   totalbill=reading*2;
               }
               else if(reading>100 && reading<=200){
                   totalbill=reading*(4.50);
               }
               else if(reading>200 && reading<=500){
                   totalbill=reading*6;
               }
               else{
                   totalbill=reading*(7);
               }
               
           }
           return(totalbill);
       }
}
public class ElectricityBill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String consumer_name = sc.nextLine();
        System.out.println("Enter your number:");
        int cell_number = sc.nextInt();
        System.out.println("Enter last month reading ");
        double lastmonth_reading = sc.nextDouble();
        System.out.println("Enter currnt month reading");
        double thismonth_reading = sc.nextDouble();
        System.out.println("Enter EB Connection type(DOMESTIC/COMMERCIAL): ");
        String eb_type = sc.next();
        Bill bill1 = new Bill(consumer_name,cell_number,lastmonth_reading,thismonth_reading,eb_type);
        System.out.println("............................................................");
        System.out.println("Consumer Name"+bill1.getName());
        System.out.println("Consumer Number"+bill1.getNumber());
        System.out.println("Consumer's EB Connection Type"+bill1.getType());
        System.out.println("Consumer's previous_month_reading"+bill1.getBeforeReading());
        System.out.println("Consumer's current_month_reading"+bill1.getNowReading());
        System.out.println("Total ElectricityBill : "+bill1.getTotalBill());
    } 
    
}

