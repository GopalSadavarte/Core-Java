// 3. Write a java program for union of two integer array.

import java.util.*;

public class Union{
    public static void main(String str[]){
        int a[]={2,4,6,1,2,8,3};
        int b[]={1,2,3,4,5,6};
        ArrayList<Integer>list = new ArrayList<Integer>();

        for(int i=0;i<a.length;i++){
            if(!list.contains(a[i])){
                list.add(a[i]);
            }
        }

        for(int i=0;i<b.length;i++){
            if(!list.contains(b[i])){
                list.add(b[i]);
            }
        }
        Collections.sort(list);
    
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}