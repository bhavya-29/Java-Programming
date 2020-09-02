import java.io.*;
import java.util.Scanner;
public class GameOfNumbers{
          public static int compositeNum(int num){
              int flag=0;
              for(int i=2;i<num;++i){
                  if(num%i==0){
                      flag=1;
                      break;
                  }
              }
              if(flag==1){
                  return(1);
              }
              else{return(0);}
              
          }
          
          public static int winPlayer(int a,int b,int n){
              int p=0;
              int q=0;
              //System.out.printf("%d %d\n",a,b);
              for(int i=2;i<a;i++){
                  if(a%i==0 && compositeNum(i)==1){
                      p++;
                  }
              }
              for(int j=2;j<b;j++){
                  if(b%j==0 && compositeNum(j)==1){
                      //System.out.println(j);
                      q++;
                  }
              }
              if(n%2==0){
                  if(p!=0 && q==0){return(1);}
                  else{return(0);}
              }
              else{
                  if(p!=0 && q==0){return(0);}
                  else{return(1);}
              }
          }
        
          public static void main(String []args) {
             //Write your code here  
             Scanner sc = new Scanner(System.in);
             int N = sc.nextInt();
             int A[] = new int[N];
             String p1 = "AMAN";
             String p2 = "JASBIR";
             for(int i=0;i<N;i++){
                 A[i]=sc.nextInt();
             }
             if(N==1){System.out.println(p1);}
             else{
                 int res;
                 res=winPlayer(A[N-2],A[N-1],N);
                 if(res==1){System.out.println(p1);}
                 else{System.out.println(p2);}
             }
          }
}

