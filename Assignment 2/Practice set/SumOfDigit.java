/*4. Write a Java program to calculate sum of digits of a number using Recursion.  */

public class SumOfDigit {
   public int sum(int num){
       if(num == 0){
        return 0;
       }else{
        int d=num%10;
         return d+sum(num/10);
       }
    }

    public static void main(String s[]){
        SumOfDigit sum=new SumOfDigit();
        System.out.println(sum.sum(123456789));
    }
}
