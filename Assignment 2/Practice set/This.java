/*5. Write a Java program to for the implementation of this keyword. */
public class This {
    private int a,b;

    //this keyword are refer to the current instance of the class
    This(int a,int b){
        this.a=a;
        this.b=b;
    }

    //in below method the this keyword are refer to current instance and display the current instance value of a and b
    void display(){
        System.out.println("The value of a and b are:"+this.a+"  "+this.b);
    }

    public static void main(String s[]){
        This t=new This(10, 20);
        This t1=new This(40, 50);

        t.display();
        t1.display();
    }
}
