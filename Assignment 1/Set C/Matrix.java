//4. Write a java program to display transpose of given matrix. 

import java.util.Scanner;

public class Matrix {
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row of matrix:");
        int row=sc.nextInt();
        System.out.print("Enter column of matrix:");
        int col=sc.nextInt();

        int matrix[][]=new int[row][col];
        int transpose[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter "+(i+1)+" row of "+(j+1)+" column element:");
                matrix[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+'\t');
            }
            System.out.println();
        }
        sc.close();
        
    }
}
