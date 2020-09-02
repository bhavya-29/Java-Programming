import java.io.*;
public class SpiralMatrix{
         public static void main(String []args){
                  int [][] matrix = new int[5][5];

                 // Write your code here
                 int row=0;
                 int n=5;
                 int p=0;
                 int col=0;
                 int count=1;
                 int i,j,k,l;
                 while(n>=3 ){
                     for(i=col;i<n;i++){
                         matrix[row][i]=count;
                         count++;
                     }
                     col=i-1;
                     row+=1;
                     for(j=row;j<n;j++){
                         matrix[j][col]=count;
                         count++;
                     }
                     row=j-1;
                     col-=1;
                     for(k=col;k>=p;k--){
                         matrix[row][k]=count;
                         count++;
                     }
                     col=p;
                     row-=1;
                     for(l=row;l>p;l--){
                         matrix[l][col]=count;
                         count++;
                     }
                     n-=1;
                     p+=1;
                     row=p;
                     col+=1;
                     
                 }

                 for(int r=0;r<5;r++) {
                      for(int c=0;c<5;c++) {
                          System.out.print(String.valueOf(matrix[r][c] +"\t"));
                      }
                      System.out.println();
                 }
       }
}





