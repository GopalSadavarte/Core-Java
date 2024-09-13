// Write a java Program to display all the perfect numbers between 1 to n.
import java.util.Scanner;
public class PerfectNumList{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a range to display list:");
		int start=sc.nextInt();
		int end=sc.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++){
			for(int j=1;j<=i/2;j++){
				if(i % j == 0)
					sum+=j;	
			}
			if(sum==i)
				System.out.print(i+" ");
			sum=0;
		}
		sc.close();
	}
}