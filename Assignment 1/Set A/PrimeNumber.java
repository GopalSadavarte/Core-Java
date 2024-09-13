// Write a java Program to check whether given number is Prime or Not.
import java.util.Scanner;
class PrimeNumber{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<=num/2;i++){
			if(num % i == 0){
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.print("The number "+num+" is prime number!");
		}else{	
			System.out.print("The number "+num+" is not a prime number!");
		}
		sc.close();
	}
}