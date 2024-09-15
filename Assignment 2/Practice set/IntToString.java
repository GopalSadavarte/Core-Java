/*3. Write a Java program to convert integer primitive data. (use toString()).  */
public class IntToString {
    public static void main(String[] args) {
        int a=10;
        String b=Integer.toString(a);
        System.out.println("Before Converting:");
        System.out.println(a +" and Type of "+a+" is "+((Object)a).getClass());
        System.out.println("After Converting:");
        System.out.println(b +" and Type of "+b+" is "+b.getClass());
    }
}
