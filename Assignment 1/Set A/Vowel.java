//Write a java program to display the vowels from a given string. 
import java.util.Scanner;
import java.util.Arrays;
class Vowel{
	public static void main(String s[]){
		char arr[]={'A','E','I','O','U','a','e','i','o','u'};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=sc.nextLine();
		System.out.print("The vowels are:");
		for(int i=0;i<input.length();i++){
			int res=Arrays.binarySearch(arr,input.charAt(i));
			if(res>=0)
				System.out.print(input.charAt(i)+" ");
		}
		sc.close();
	}
}