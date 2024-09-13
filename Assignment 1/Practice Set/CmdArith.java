/* Write a Java program to accept two numbers using command line argument and    calculate addition, subtraction, multiplication and division. */
public class CmdArith{
	private int a,b;
	CmdArith(int num1,int num2){
		a=num1;
		b=num2;
	}
	public int add(){
		return a+b;
	}
	public int mult(){
		return a*b;
	}
	public int sub(){
		return a-b;
	}
	public int devide(){
		return a/b;
	}
	public static void main(String s[]){
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		CmdArith arith=new CmdArith(a,b);
		System.out.println("Addition:"+arith.add());
		System.out.println("Substraction:"+arith.sub());
		System.out.println("Multiplication:"+arith.mult());
		System.out.println("Division:"+arith.devide());
	}
}