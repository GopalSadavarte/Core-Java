//Write a java Program to check whether given String is Palindrome or not.
import java.util.Scanner;
class Palindrome{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		//get string form user
		System.out.print("Enter a String:");
		String s=new String(sc.nextLine());
		//checking the string is palindrome or not
		//char temp[]=new char[s.length()];
		String temp="";
		int j=0;
		for(int i=s.length()-1;i>=0;i--)
			temp=temp + s.charAt(i);
		if(s.compareTo(temp)==0)
			System.out.println("The String is palindrome!");
		else
			System.out.println("The String not a palindrome!");
		sc.close();
	}
}