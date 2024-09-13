//Write a Java program to display Fibonacci series.
import java.util.Scanner;
class Fibonacci{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range for series:");
		int l=sc.nextInt();
		long a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<l;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}