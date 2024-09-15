/*1. Define a class person(pid,p name,age,gender). Define Default and parameterised
constructor. Overload the constructor. Accept the 5 person details and display it.(use this 
keyword).  */

class Person{
    private int pId,age;
    private String name,gender;

    Person(){
        pId=0;
        age=0;
        name=null;
        gender=null;
    }

    Person(int id,int age,String name,String gender){
        this.pId=id;
        this.age=age;
        this.name=name;
        this.gender=gender;
    }

    void display(){
        System.out.println("The person details:");
        System.out.println("Id:"+this.pId);
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Gender:"+this.gender);
        System.out.println("----------------------------");
    }
}

public class ClassPerson{
    public static void main(String[] args) {
        Person p[]=new Person[5];
        int ids[]={1,2,3,4,5};
        int ages[]={20,25,30,33,45};
        String names[]={"Ganesh","Rahul","Vinod","Govind","Ram"};
        for(int i=0;i<5;i++){
            p[i]=new Person(ids[i],ages[i],names[i],"Male");
        }

        System.out.println("-----------Information-----------");
        for (int i = 0; i < 5; i++) {
            p[i].display();
        }
    }
}