import java.util.Scanner;
class Sort{
	public static void main(String a[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter array size:");
		int ar[]=new int[s.nextInt()];
		System.out.println("Enter ele:");
		for(int i=0;i<ar.length;i++){
			ar[i]=s.nextInt();
		}
		
		int temp;
		for(int pass=1;pass<=ar.length;pass++){
			for(int i=0;i<ar.length;i++){
				if(ar[i]>ar[i+1]){
					temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}
			}
		}
		
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
		s.close();
	}
}