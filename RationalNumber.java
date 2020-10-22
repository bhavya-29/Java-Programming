import java.io.*;
import java.util.Scanner;
public class RationalNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rational number : ");
		String rat_num = sc.nextLine();
		String str[] = rat_num.split("/");
		long n1 = Long.parseLong(str[0]);
		long n2 = Long.parseLong(str[1]);
		fractionForm(n1,n2);
	}
	
	public static long gcd(long a, long b) {
             return b == 0 ? a : gcd(b, a % b);
        }

        public static void fractionForm(long a, long b) {
    		long gcd = gcd(a, b);
		//System.out.println(gcd);
    		long numerator=(a/gcd);
		long denominator=(b/gcd);
		System.out.println(numerator+"/"+denominator);
        }
}