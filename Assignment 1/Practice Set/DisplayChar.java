//Write a Java program to display characters from A to Z using loop.
class DisplayChar{
	public static void main(String s[]){
		char ch='A';
		while(ch != ('Z'+1))System.out.print(ch++ +" ");
	}
}