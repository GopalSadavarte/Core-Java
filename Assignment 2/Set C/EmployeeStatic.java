/*2. Write a java program to accept n employee names from user. Sort them in ascending 
order and Display them.(Use array of object nd Static keyword) 
 */

import java.util.*;

class Employee{
    private String name;
    private long phone;
    public static int count;

    Employee(String name,long mobileNo){
        this.name=name;
        this.phone=mobileNo;
        Employee.count++;
    }

    public static void sort(Employee arr[]){
        Employee temp;
        for (int pass = 1; pass < arr.length; pass++) {
           for (int i = 0; i < arr.length-pass; i++) {
              if(arr[i].name.compareTo(arr[i+1].name)>0){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
              }
           } 
        }
    }

    public static void sortSelection(Employee arr[]){
        Employee temp,temp1;
        for (int i = 0; i < arr.length; i++) {
            temp=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(temp.name.compareTo(arr[j].name)>0){
                    temp1=arr[j];
                    arr[j]=temp;
                    temp=temp1;
                }
            }
            arr[i]=temp;
        }
    }

    public static void sortInsertion(Employee arr[]){
        Employee temp;
        int j;
        for(int i=0;i<arr.length;i++){
            temp=arr[i];
            for(j=i-1;j>=0 && (arr[j].name.compareTo(temp.name)>0);j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
    }

    public static void display(Employee arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name+"   "+arr[i].phone);
        }
    }
}
public class EmployeeStatic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length;
        System.out.println("Enter length:");
        length=sc.nextInt();
        Employee e[]=new Employee[length];
        for (int i = 0; i < e.length; i++) {
            System.out.printf("Enter %d employee name:",i+1);
            String name=sc.next();
            System.out.printf("Enter %d employee phone no.:",i+1);
            long phone=sc.nextLong();

            e[i]=new Employee(name, phone);
        }

        Employee c1[],c2[],c3[];

        c1=e.clone();
        c2=e.clone();
        c3=e.clone();

        Employee.sort(c1);
        Employee.sortInsertion(c2);
        Employee.sortSelection(c3);

        System.out.println("Sort by bubble sort:");
        Employee.display(c1);
        System.out.println("Sort by insertion sort:");
        Employee.display(c2);
        System.out.println("Sort by selection sort:");
        Employee.display(c3);

        System.out.println("The total employees are:"+Employee.count);

        sc.close();
    }
}
