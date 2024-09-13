//Write a Java program to calculate sum of digits of a number
class SumOfDigitsGiveArgByCmd{
	public static void main(String s[]){
		int a = Integer.parseInt(s[0]);
		int sum=0,d;
		while(a>0){
			d=a%10;
			sum+=d;
			a/=10;
		}
		System.out.print("The Sum of digits is :"+sum);
	}
}