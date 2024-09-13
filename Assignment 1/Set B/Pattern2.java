/*5. Write a java program to display following pattern: 
1 
0 1 
0 1 0 
1 0 1 0  */
public class Pattern2 {
    public static void main(String str[]){
        int st=1;
        for (int i=1;i<=5;i++){
            for (int j=0;j<i;j++){ 
                System.out.print(st + " ");
                st = (st==1)?0:1;
            }
            System.out.println();
        }
    }
}
