import java.io.*;

import java.util.Scanner;

public class BinarySrchOfWords{
        
	public static int stringCompare(String str1, String str2) 
        
	{ 
      
            
		int l1 = str1.length(); 
            
		int l2 = str2.length(); 
            
		int lmin = Math.min(l1, l2); 
      
            
		for (int i = 0; i < lmin; i++) { 
                
			int str1_ch = (int)str1.charAt(i); 
                
			int str2_ch = (int)str2.charAt(i); 
      
                
			if (str1_ch != str2_ch) { 
                    
				return str1_ch - str2_ch; 
                
			} 
            
		}
	 
       if (l1 != l2) { 
                
			return l1 - l2; 
            
		} 
            
		else { 
                
			return 0; 
            
		} 
        
	}

        
public static int binarySearchofWords(String dict[],int n,String key){
            
		int lb,ub,mid;
            
		lb=0;
            
		ub=n-1;
            
		while(lb<=ub){
                
			mid=(lb+ub)/2;
                
			int res = stringCompare(dict[mid],key);
                
			//System.out.println(res);
                
			if(res==0){
                    
				return(mid);
                
			}

                        else{
                    
				if(res<0){
                        
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
            
		String dict[] = {"ALORITHM","ANALOG","APP","APPLICATION","ARRAY","BACKUP","BANDWIDTH","BINARY",
"BIT","BITE","CAPS","CAPTCHA","CD","CD-ROM","CLIENT","DASHBOARD","DATA","DATABASE","DEBUG",
"EMAIL","ENCRYPT","ENTER","FILE","FIREWALL","GIGABITE","HACK","HARDWARE"};
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