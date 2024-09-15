/*3. Define a class Student(roll no,name,per). Create n objects of the student class and Display 
it using toString().(Use parameterized constructor)  */

import java.util.Scanner;

class Student{
    private int rollNo;
    private String name;
    private double per;
    Student(){
        System.out.println("Default constructor!");
    }
    Student(int roll_no,String student_name,double percentage){
        this.name=student_name;
        this.rollNo=roll_no;
        this.per=percentage;
    }

    void display(){
        System.out.println("The roll no.:"+this.rollNo);
        System.out.println("The name.:"+this.name);
        System.out.println("The percentage.:"+this.per);
    }
}
public class StudentClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student array length:");
        int n=sc.nextInt();
        Student s[]=new Student[n];
        for (int i = 0; i < s.length; i++) {
            System.out.printf("Enter %d student roll number:",i+1);
            int r=sc.nextInt();
            System.out.printf("Enter %d student name:",i+1);
            String name=sc.next();
            System.out.printf("Enter %d student percentage:",i+1);
            double p=sc.nextDouble();
            s[i]=new Student(r,name,p);
        }

        for(int i=0;i<s.length;i++){
            System.out.println(s[i].toString());
        }
        sc.close();
    }
}
