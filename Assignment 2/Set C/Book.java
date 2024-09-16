/*4. Write a java program to accept details of ‘n’ books. And Display the quantity of given 
book. */

import java.util.Scanner;

public class Book {
    private int id,quantity,price;
    private String name;
    private String author;

    Book(int id,String name,String author,int price,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }
    public String getName(){
        return this.name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:"); 
        int n=sc.nextInt();
        Book b[]=new Book[n];

        for(int i=0;i<b.length;i++){
            System.out.print("Enter book id:");
            int id=sc.nextInt();
            System.out.print("Enter book name:");
            String bName=sc.next();
            System.out.print("Enter author name:");
            String author=sc.next();
            System.out.print("Enter price:");
            int p=sc.nextInt();
            System.out.print("Enter quantity:");
            int q=sc.nextInt();
            b[i]=new Book(id,bName,author,p,q);
        }

        System.out.print("Enter name of the book to display quantity:");
        String name=sc.next();
        for(int i=0;i<b.length;i++){
            if(name.compareTo(b[i].getName())==0){
                System.out.print("The quantity is:"+b[i].getQuantity());
            }
        }
        sc.close();
    }
}