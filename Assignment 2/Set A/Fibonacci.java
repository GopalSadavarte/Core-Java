/*2. Write a Java program to display Fibonacci series using function. */
public class Fibonacci {
    protected static void fib(int range){
        int f1=0,f2=1,f3;
        System.out.print(f1+"\t"+f2+"\t");
        for(int i=0;i<(range-2);i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(f3+"\t");
        }
    }

    public static void main(String s[]){
        fib(10);
    }
}
