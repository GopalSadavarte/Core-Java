/*5. Write a Java program to calculate factorial of a number using recursion.  */
import java.util.Scanner;
public class Factorial {
    public static long fact(int num){
        //normal way,using if-else
        // if(num == 0 || num==1){
        //     return 1;
        // }else{
        //     return num*fact(num-1);
        // }
        //using turnery operators
        return (num == 0 || num == 1) ? 1 : num*fact(num-1);
    }

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for factorial:");
        int num=sc.nextInt();
        long f=Factorial.fact(num);
        System.out.printf("Factorial of %d is %d", num,f);
        sc.close();
    }
}
