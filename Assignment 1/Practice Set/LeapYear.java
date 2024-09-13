//Write a Java program to accept a year and check if it is leap year or not. 
import java.util.Scanner;
public class LeapYear{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year:");
		int year=sc.nextInt();
		if(year % 4 == 0)
			System.out.println(year+" is leap year!");
		else
			System.out.println(year+" is not leap year!");
		sc.close();
	}
}