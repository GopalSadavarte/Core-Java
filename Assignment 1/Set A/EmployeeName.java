//Write a java Program to accept employee name from a user and display it in reverse order. 
import java.util.Scanner;
class EmployeeName{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String name=new String(sc.nextLine());
		String rev="";
		for(int i=name.length()-1;i>=0;i--){
			rev=rev+name.charAt(i);
		}
		System.out.println("The reverse name is :"+rev);
		sc.close();
	}
}