/*4. Write a java program to display following pattern: 
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5  */
public class Pattern {
    public static final void main(String s[]){
        for(int i=5;i>=1;i--){
            int k=i;
            for(int j=5;j>=i;j--){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
