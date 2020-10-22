import java.io.*;
import java.util.Scanner;
abstract class Shape{
	protected int a;
	protected int b;
	public Shape(int a,int b){
		this.a=a;
		this.b=b;
	}
	public abstract void printArea();
}
class Rectangle extends Shape{
	public Rectangle(int a, int b){
		super(a,b);
	}
	@Override
	public void printArea(){
		System.out.println("Rectangle area is "+a*b);
	}
}
class Triangle extends Shape{
	public Triangle(int a,int b){
		super(a,b);
	}
	@Override
	public void printArea()
	{
		System.out.println("Triangle Area is" + (0.5 * a * b));
	}
} 
class Circle extends Shape{
	public Circle(int a,int b){
		super(a,b);
	}
	@Override
	public void printArea()
	{
		System.out.println("Circle Area  of radius "+a + (3.14 * a * a));
		System.out.println("Circle Area  of radius "+b + (3.14 * b * b));
	}
}
public class Experiment11{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("choose the type of shape needed : ");
		System.out.println("1.Rectangle\n2.Triangle\n3.Circle");
		int choice = sc.nextInt();
		System.out.println("enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("enter the value of b : ");
		int b=sc.nextInt();
		switch(choice){
			case 1:{
				Rectangle R = new Rectangle(a,b);
				R.printArea();
				break;
			}
			case 2:{
			       Triangle T = new Triangle(a,b);
			       T.printArea();
			       break;
			}
			case 3:{
			       Circle C = new Circle(a,b);
			       C.printArea();
			       break;
			}
		}
	}
}