/*3. Write a Java program to calculate area of Circle, Triangle & Rectangle.(Use Method 
Overloading) */
public class OverloadingArea {
    final static double PI=3.14;
    public double area(double radius){
        return PI*(radius*radius);
    }

    public double area(double length,double width){
        return length*width;
    }

    public double areaOfTriangle(double base,double height){
        return 1/2*(base*height);
    }

    public static final void main(String s[]){
        OverloadingArea a=new OverloadingArea();
        System.out.println("The area of circle is:"+a.area(5));
        System.out.println("The area of rectangle is:"+a.area(5,10));
        System.out.println("The area of triangle is:"+a.areaOfTriangle(8, 10));
    }
}
