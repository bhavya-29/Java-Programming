import java.io.*;
import java.util.Scanner;
public class UserID{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int pin = sc.nextInt();
		String str_pin = String.valueOf(pin);
		String arr_pin[] = str_pin.split("");
		int N = sc.nextInt();
		String str = compareString(s1,s2);
		StringBuffer new_str = new StringBuffer(str);
		convertOpposite(new_str); 
		String ans = new_str+arr_pin[N-1]+arr_pin[str_pin.length()-N];
		System.out.println(ans);
	}
	public static String compareString(String s1,String s2){
		String arr_s2[] = s2.split("");
		String arr_s1[] = s1.split("");
		int s1_len = s1.length();
		int s2_len = s2.length();
		if(s1_len>s2_len){
			return((arr_s2[s2_len-1]+s1));
		}
		else if (s1_len < s2_len){
			return((arr_s1[s1_len-1]+s2));
		}
		else{
			int res = s1.compareTo(s2);
			if(res<0)
				return((arr_s1[s1_len-1]+s2));
			else
				return((arr_s2[s2_len-1]+s1));
		}
		
	} 
	public static void convertOpposite(StringBuffer str) 
     { 
        int ln = str.length(); 
        for (int i=0; i<ln; i++) 
        { 
            Character c = str.charAt(i); 
            if (Character.isLowerCase(c)) 
                str.replace(i, i+1, Character.toUpperCase(c)+""); 
            else
                str.replace(i, i+1, Character.toLowerCase(c)+""); 
             
        } 
     } 
}
