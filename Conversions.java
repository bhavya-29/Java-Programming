package converters;
import java.io.*;
import java.util.Scanner;
import converters.CurrencyConversion;
import converters.DistanceConversion;
import converters.TimeConversion;

public class Conversions{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("choose the choice of converters available: ");
		System.out.println("1.Currency Converter\n2.Distance Converter\n3.Time Conversion");
		int choice =sc.nextInt();
		switch(choice){
			case 1 : {System.out.println("enter the amount: ");
				double amt = sc.nextDouble();
				System.out.println("choose the choice of conversion : ");
				System.out.println("1.Dollar to Indian\n2.Euro to Indian\n3.Yen to Indian\n4.Indian to Dollar\n5.Indian to Euro\n6.Indian to Yen");
				int ch = sc.nextInt();
				CurrencyConversion c1 = new CurrencyConversion(amt,ch);
				System.out.println(c1.conversion());
				break;
				}
			case 2 : {System.out.println("enter the distance: ");
				double dis = sc.nextDouble();
				System.out.println("choose the choice of conversion : ");
				System.out.println("1.Kilometer to Meter\n2.Meter to Kilometer\n3.Kilometer to Miles\n4.Miles to Kilometer");
				int ch = sc.nextInt();
				DistanceConversion d1 = new DistanceConversion(dis,ch);
				System.out.println(d1.conversion());
				break;
				}
			case 3 : {System.out.println("enter the time: ");
				double time = sc.nextDouble();
				System.out.println("choose the choice of conversion : ");
				System.out.println("1.Hours to Minutes\n2.Hours to Seconds\n3.Minutes to hours\n4.Seconds to Hours");
				int ch = sc.nextInt();
				TimeConversion t1 = new TimeConversion(time,ch);
				System.out.println(t1.conversion());
				break;
				}	
		}	
	}
}