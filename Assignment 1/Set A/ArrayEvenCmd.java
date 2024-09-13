//Write a java program to display all the even numbers from an array. (Use Command Line 
//arguments) 
class ArrayEvenCmd{
	public static void main(String arg[]){
		int temp;
		System.out.println("The Even number in array are:");
		for(int i=0;i<arg.length;i++){
			temp=Integer.parseInt(arg[i]);
			if(temp%2==0)
				System.out.print(temp+" ");
		}
	}
}
