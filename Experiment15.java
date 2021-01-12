import java.io.*;
import java.util.Random;

class Square extends Thread{
	public int n;
 	public Square(int n){
		this.n = n;
 	}
 	public void run(){
		double sqr = n*n;
 		System.out.println(sqr);
 	}

}

class Cube extends Thread{
	public int n;
	public Cube(int n){
		this.n = n;
	}
	public void run(){
		double cube = n*n*n;
		System.out.println(cube);
	}

}

class Thread1  extends Thread{ 
	public void run(){
		Random r = new Random();
		int x = r.nextInt();
		System.out.println("random number generated : "+x);
		if(x%2==0){
			Square s1 = new Square(x);
			s1.start();
		}
		else{
			Cube c1 = new Cube(x);
			c1.start();
		}
	}
}

public class Experiment15{
	public static void main(String[] args){
		Thread1 thrd1 = new Thread1();
		thrd1.start();
	}
}



