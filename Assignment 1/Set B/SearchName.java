//3. Write a java program to search given name into the array, if it is found then display its index 
// otherwise display appropriate message. 

import java.util.Scanner;

public class SearchName {
    public final static void main(String s[]){
        int len;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of name array:");
        len = sc.nextInt();
        String names[] = new String[len];
        for(int i=0;i<len;i++){
            System.out.print("Enter "+(i+1)+" name:");
            names[i]=new String(sc.nextLine());
        }

        System.out.println("Enter name to search:");
        String search = new String(sc.nextLine());

        int flag=0;
        for (int i=0;i<len;i++){
            if(names[i].equals(search))
            {
                flag=1;
                System.out.println("The "+search+" are found in "+(i+1)+" position!");
                break;
            }
        }

        if(flag==0)
            System.out.print("The name not found!!");
        sc.close();

    }
}
