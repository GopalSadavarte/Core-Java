/*Write a Java program which accepts three integer values and prints the maximum and 
minimum.*/
import java.util.Scanner;
public class MaxMin{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c){
			System.out.println("The Max number is: "+a);
		}else if(b>a && b>c){
			System.out.println("The Max number is: "+b);
		}else{
			System.out.println("The Max number is: "+c);
		}

		if(a<b && a<c){
			System.out.println("The Min number is: "+a);
		}else if(b<a && b<c){
			System.out.println("The Min number is: "+b);
		}else{
			System.out.println("The Max number is: "+c);
		}
		sc.close();
	}
}