/*1. Write a java program to count the frequency of each character in a given string.  */

import java.util.ArrayList;
import java.util.Scanner;
class Character{
    public int count;
    public char ch;
}
public class Frequency {
    static final public void main(String str[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            int flag=0;
            for(int j=0;j<list.size();j++){
                if(list.get(j).ch == s.charAt(i)){
                    list.get(j).count++;
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                Character chr=new Character();
                chr.ch=s.charAt(i);
                chr.count=1;
                list.add(chr);
            }
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).ch + " are occur up to " + list.get(i).count + " times!");
        }
        sc.close();
    }
}
