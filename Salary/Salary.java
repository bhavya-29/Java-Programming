import java.io.*;
import java.util.Scanner;
public class Salary{
	public static void main(String ars[]){
		Scanner sc= new Scanner(System.in);
		String arr[] = new String[6];
		System.out.println("choose the type of employee :");
		System.out.println("1.Programmer\n 2.Assistant Professor\n 3.Associate Professor\n 4.Professor");
		int option = sc.nextInt();
		switch(option){
			case 1:{
				getDetails(arr);
		                Programmer p1 =new Programmer(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
		                p1.calculatesal();
		                p1.display();
				break;
			}
			case 2:{
				getDetails(arr);
		                AssistantProfessor p1 =new AssistantProfessor(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
		                p1.calculatesal();
		                p1.display();
				break;
			}
			case 3:{
				getDetails(arr);
		                AssociateProfessor p1 =new AssociateProfessor(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
		                p1.calculatesal();
		                p1.display();
				break;
			}
			case 4:{
				getDetails(arr);
		                Professor p1 =new Professor(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
		                p1.calculatesal();
		                p1.display();
				break;
			}
		}
	}
	public static String[] getDetails(String arr[]){
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<6;i++){
			arr[i]="";
		}
		System.out.println("Enter the Name : ");
		arr[0]+=sc.nextLine();
		System.out.println("Enter the ID : ");
		arr[1]+=sc.next();
		System.out.println("Enter the Address : ");
		arr[2]+=sc.next();
		System.out.println("Enter the Gmail ID : ");
		arr[3]+=sc.next();
		System.out.println("Enter the Mobile Number : ");
		arr[4]+=sc.next();
		System.out.println("Enter the Basic Pay : ");
		arr[5]+=sc.next();
		return(arr);
	}
}