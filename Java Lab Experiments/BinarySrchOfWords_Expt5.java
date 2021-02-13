import java.io.*;
import java.util.Scanner;
public class BinarySrchOfWords_Expt5{        
	public static int binarySearchofWords(String dict[],int n,String key){            
		int lb,ub,mid;
		lb=0;
		ub=n-1;
		while(lb<=ub){
			mid=(lb+ub)/2;
			//int res = stringCompare(dict[mid],key);
			if(key.compareTo(dict[mid])==0){
				return(mid);
			}
                        else{
				if(key.compareTo(dict[mid])>0){
					lb=mid+1;
				}
                                else{
					ub=mid-1;
				}
			}
		}
		return(-1);            
	}
  
	public static void main(String []args){
		String dict[] = {"ALGORITHM","ANALOG","APP","APPLICATION","ARRAY","BACKUP","BANDWIDTH","BINARY","BIT","BITE","CAPS","CAPTCHA","CD","CD-ROM","CLIENT",
				 "DASHBOARD","DATA","DATABASE","DEBUG","EMAIL","ENCRYPT","ENTER","FILE","FIREWALL","GIGABITE","HACK","HARDWARE"};
                Scanner sc = new Scanner(System.in);
     		for(int i=0;i<dict.length;i++){
			System.out.print(dict[i]+" ");
		}
		System.out.println();
		System.out.print("Enter key to find position: ");
		String key = sc.nextLine();
		int position = binarySearchofWords(dict,dict.length,key);
		// System.out.println(dict.length);
		if(position==-1){
			System.out.println("not found");
		}
		else{
			System.out.println("Given word is found at :"+position);
		}
	}
}
