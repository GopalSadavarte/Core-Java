/*2. Write a java program to display each word in reverse order from a string array.  */

import java.util.Scanner;

public class ReverseWord {
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        int size ;
        System.out.println("Enter size of string array:");
        size=sc.nextInt();
        String arr[]=new String[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter  string for array:");
            StringBuffer str1=new StringBuffer(sc.nextLine()).reverse();
            arr[i]=str1.toString();
        }

        System.out.println("The String list with reverse order:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
