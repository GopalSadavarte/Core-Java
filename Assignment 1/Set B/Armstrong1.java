/*2. Write a java program to accept n numbers from a user store only Armstrong1 numbers in an array 
and display it.  */
import java.util.*;
public class Armstrong1{
    public static final Scanner input=new Scanner(System.in);
    private ArrayList<Integer> arr;
    private int length;
    public Armstrong1(int len){
        this.length=len;
        this.arr = new ArrayList<Integer>();
        for (int i=0;i<this.length;i++){
            System.out.println("Enter "+(i+1)+" array element:");
            int temp=Armstrong1.input.nextInt();
            if(this.isArmstrong(temp)){
                this.arr.add(temp);
            }
        }
    }

    private boolean isArmstrong(int num){
        int len=Integer.toString(num).length();
        double fact=0;
        int temp1=num;
        while(temp1>0){
            int digit=temp1%10;
            fact = fact + Math.pow(digit,len);
            temp1=temp1/10;
        }
        return num==fact; 
    }

    public void display(){
        if(this.arr.isEmpty()){
            System.out.println("Armstrong1 not found!");
        }else{
            for (int i=0;i<this.arr.size();i++){
                System.out.print(this.arr.get(i)+'\t');
            }
        }
        
    }
    public static final void main(String s[]){
        int len;
        System.out.println("Enter length of array:");
        len=Armstrong1.input.nextInt();
        Armstrong1 a=new Armstrong1(len);
        a.display();
    }
}