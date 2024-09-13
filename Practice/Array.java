import java.util.Scanner;
class Array{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length:");
		int l=sc.nextInt();
		int arr[]=new int[l];
		int temp;
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("The array is:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		sc.close();
	}
}