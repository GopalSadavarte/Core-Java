/*1. Define class Student(rno, name, mark1, mark2). Define Result class(total, percentage) 
inside the student class. Accept the student details & display the mark sheet with rno, 
name, mark1, mark2, total, percentage. (Use inner class concept)  */
class Student{
    private int rno,mark1,mark2;
    private String name;
    private Result r;

    Student(int rno,String name,int mark1,int mark2){
        this.r=new Result();
        this.mark1=mark1;
        this.mark2=mark2;
        this.name=name;
        this.rno=rno;
    }

    public void display(){
        System.out.println("-----------Student MarkSheet----------");
        System.out.println("Student roll no.:"+this.rno);
        System.out.println("Student name:"+this.name);
        System.out.println("Student first subject marks:"+this.mark1);
        System.out.println("Student second subject marks:"+this.mark2);
        this.r.calculate(this.mark1, this.mark2);
        this.r.display();
    }

    class Result{
        private double total,percentage;

        public void calculate(int m1,int m2){
            this.total=m1+m2;
            this.percentage=this.total/2;
        }

        public void display(){
            System.out.println("The total marks:"+this.total);
            System.out.println("The percentage:"+this.percentage);
        }
    }
}
public class InnerClass {
    public static void main(String args[]){
        Student s=new Student(1, "Rakesh", 60, 75);
        s.display();
    }
}
