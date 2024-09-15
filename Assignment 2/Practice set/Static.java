/*2. Write a Java program to keep the count of object created of a class. Display the count 
each time when the object is created. */
public class Static {
    static int count;
    Static(){
        Static.count++;
        System.out.println("The Count="+Static.count);
    }
    public static void main(String s[]){
        Static s1=new Static();
        Static s2=new Static();
        Static s3=new Static();
        Static s4=new Static();
        Static s5=new Static();
    }
}
