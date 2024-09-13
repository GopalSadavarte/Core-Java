// Write a java program to calculate the sum of even numbers from an array. 
import java.util.Scanner;
class SumOfEvenInArray{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int len=sc.nextInt();
		int arr[]=new int[len];
		int sumEven=0;
		System.out.println("Enter Array elements:");
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter "+(i+1)+" array element:");
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				sumEven+=arr[i];
			}
		}
		System.out.println("The sum of even elements are :"+sumEven);
	}
}