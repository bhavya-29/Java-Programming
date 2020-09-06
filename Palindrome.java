import java.io.*;
import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String s = String.valueOf(n);
		String ch = removeDigit(s,s.length());
		System.out.println(ch);
 	}
	public static String removeDigit(String s, int n){
		String arr[] = s.split("");
		//System.out.println(arr[0]+arr[1]);
		int count[]= new int[n];
		String ans="-1";
		for(int i=0;i<n;i++){
			int l=1;
			for(int j=0;j<n;j++){
				if(i!=j){
					if((arr[i].compareTo(arr[j]))==0){
						l++;
					}
				}
			}
			count[i]=l;
		}
		for(int k=0;k<n;k++){
			if(count[k]%2==0){continue;}
			else if(count[k]%2!=0 && k==n/2){
				continue;
			}
			else{
				ans=arr[k];
			}
		}
		//System.out.println(count[0]);
		return(ans);
	} 
}
