/*1. Write a Java program to for the implementation of reference variable. */

public class ReferenceVar {
    int a;
    ReferenceVar(int a){
        this.a=a;
    }
    public void display(){
        System.out.println(a);
    }
    public static void main(String s[]){
        //this is main object reference e 
        ReferenceVar e=new ReferenceVar(10);
        e.display();
        //this is b reference of object reference e
        ReferenceVar b = e;
        //b follows the same instruction of e,because it refer or point to the memory location
        b.display();
        //When we assign null reference then it return null exception
        ReferenceVar c=null;
        if(c == null){
            System.out.println("This is null reference");
        }
    }
}
