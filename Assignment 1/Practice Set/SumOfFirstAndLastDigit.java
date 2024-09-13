//Write a java Program to calculate the sum of first and last digit of a number
import java.util.Scanner;
class SumOfFirstAndLastDigit{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int last=num%10;
		while(num>10)
			num=num/10;
		System.out.print("The some of first and last digit:"+(last+num));
	}
}