import java.util.Scanner;
class Scan{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		System.out.println("The Addition :"+(a+b));
		sc.close();
	}
}