//1. Write a Java program to calculate power of a number using recursion. 
public class PowerOfNum {

    //this method use loop to calculate power,but it easy to understand
    public static int power(int num,int p){
        int pow=1;
        for(int i=0;i<p;i++){
            pow=pow*num;
        }
       return pow;
    }

    //this method are use recursion for calculating the power
    public static int power1(int num,int p){
        //if the exponent are 0 then power will be 1
        if(p==0){
            return 1;
        //when the exponent are divisible by 2
        }else if(p%2==0){
            return power1(num*num, p/2);
        }else{
            //when the exponent are odd number
            return num*power1(num*num, (p-1)/2);
        }
    }
    public static void main(String s[]){
        System.out.println(power(2,3));
        System.out.println(power1(2, 3));
    }
}
