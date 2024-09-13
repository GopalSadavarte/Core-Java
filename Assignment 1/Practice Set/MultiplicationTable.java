/*Write a Java program to accept a number from command prompt and generate 
multiplication table of a number. */
class MultiplicationTable{
	public static void main(String ar[]){
		int a=Integer.parseInt(ar[0]);
		System.out.println("The Multiplication table of "+a+" is:");
		for(int i=1;i<=10;i++)
			System.out.println(a*i);
	}
}
