import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
class Info{
	private String user_name;
	private String mob_no;
	private String mail_id;
	private String password;

	public Info(){}

	public Info(String user_name,String mob_no,String mail_id,String password){
		this.user_name=user_name;
		this.mob_no=mob_no;
		this.mail_id=mail_id;
		this.password=password;
	}
	
	public void isvalidusername(){
		String regex = "[a-zA-Z]+";
		if(user_name.matches(regex))
			System.out.println("Valid User Name");
		else
			System.out.println("INVALID User Name");
	}
	
	public void isvalidnumber(){
		if(mob_no.matches("[789]{1}[0-9]{9}"))
			System.out.println("Valid Mobile Number");
		else
			System.out.println("INVALID Mobile Number");
	}

	public void isvalidmailid(){    
		String regex = "@gmail.com";  
                Pattern pattern = Pattern.compile(regex);    
                Matcher matcher = pattern.matcher(mail_id);        
                if(matcher.find()) {    
                       System.out.println("valid gmail ID");    
                }    
                else{    
                     System.out.println("INVALID gmail ID");    
                }
			
       }  

       public boolean isvalidpassword(){
		String regex = "^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])"+ "(?=.*[@#$%^&+=])"+ "(?=\\S+$).{8,20}$";
		Pattern p = Pattern.compile(regex);
		if (password == null) { 
                    return false; 
                }
		Matcher m = p.matcher(password);
		return m.matches();
	}
}

public class UserInfoValidation_Expt8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		System.out.println("Enter the mobile number");
		long num = sc.nextLong();
		String num1 = String.valueOf(num);
		System.out.println("Enter your Gmail ID : ");
		String mail = sc.next();
		System.out.println("Enter the password following below instructions : ");
		System.out.println("password must have :\n contain at least 8 characters and at most 20 characters\n contain at least one digit.\n have at least one upper case alphabet.\n contain at least one lower case alphabet.\n have at least one special character which includes !@#$%&*()-+=^.\n not contain any white space.\n");
		String password = sc.next();
		Info user1 = new Info(name,num1,mail,password);
		user1.isvalidusername();
		user1.isvalidnumber();
		user1.isvalidmailid();
		if(user1.isvalidpassword()){System.out.println("Valid Password");}
		else{System.out.println("INVALID PASSWORD");}
	}
}