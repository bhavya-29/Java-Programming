import java.io.*;

class Doubles{
	public static void main(String args[]){
		int count=0;
		int arr[] = new int[6];
		for(int i=0;i<6;i++)
			arr[i]=0;
                for(int i=0;i<10000;i++){
			int d1 = (int)(Math.random()*6)+1;
                        int d2 = (int)(Math.random()*6)+1;
                        if(d1==d2){
				switch(d1){
					case 1:arr[0]+=1;
					case 2:arr[1]+=1;
					case 3:arr[2]+=1;
					case 4:arr[3]+=1;
					case 5:arr[4]+=1;
					case 6:arr[5]+=1;
				}
			}

                 }
		count = minOf(arr);
                System.out.println("The number of times the two dice have same number is  "+count);
		for(int k=0;k<6;k++)
			System.out.println(arr[k]);
      }
	
      public static int minOf(int arr[]){
		int min=arr[0];
		for(int j=1;j<6;j++){
			if(min>arr[j])
				min=arr[j];
		}
		return(min);
	}
}