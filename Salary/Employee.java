
import java.io.*;
import java.util.Scanner;
class Employee{
	protected String emp_name;
	protected String emp_id;
	protected String address;
	protected String mail_id;
	protected String mob_no;
	
	public Employee(){}

	public Employee(String emp_name,String emp_id,String address,String mail_id,String mob_no){
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.address=address;
		this.mail_id=mail_id;
		this.mob_no=mob_no;
	}

	public void setEmp_name(String emp_name){
		this.emp_name=emp_name; 		
	}

	public void setEmp_id(String emp_id){
		this.emp_id=emp_id;
	}

	public void setAddress(String address){
		this.address=address;
	}
	
	public void setMail_id(String mail_id){
		this.mail_id=mail_id;
	}

	public void setMob_no(String mob_no){
		this.mob_no=mob_no;
	}

	public void displayEmployee(){
		System.out.println("Name : "+emp_name);
		System.out.println("ID : "+emp_id);
		System.out.println("Address : "+address);
		System.out.println("Gmail ID : "+mail_id);
		System.out.println("Mobile Number : "+mob_no);
	}
			 
}








	