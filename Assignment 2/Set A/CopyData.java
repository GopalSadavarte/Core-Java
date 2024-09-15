/*4. Write a Java program to Copy data of one object to another Object. */
public class CopyData {
    protected int a,b;
    CopyData(int num1,int num2){
        a=num1;
        b=num2;
    }

    CopyData(CopyData ob){
        a=ob.a;
        b=ob.b;
    }

    CopyData(){
        System.out.println("Default Constructor!");
        a=1;
        b=1;
    }

    public void display(){
         System.out.println("Values:"+a+" and "+b);
    }

    public static void main(String s[]){
        //parametrized constructor
        CopyData c=new CopyData(10,20);
        c.display();

        //copy constructor copied values of c in d
        CopyData d=new CopyData(c);
        d.display();

        //default constructor get default values of a and b
        CopyData e=new CopyData();
        e.display();
    }
}
