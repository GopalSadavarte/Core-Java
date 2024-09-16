/*3. Write a java program to accept details of ‘n’ cricket players(pid, p name, totalRuns, 
InningsPlayed, NotOutTimes). Calculate the average of all the players. Display the details 
of player having maximum average.  */
import java.util.*;
public class CricketPlayer {
    private int pId,totalRuns,InningsPlayed,NotOutTimes,avg;
    private String name;

    CricketPlayer(int id,int runs,int innings,int NotOutTimes){
        this.pId=id;
        this.totalRuns=runs;
        this.InningsPlayed=innings;
        this.NotOutTimes=NotOutTimes;
    }

    public void calculate(){
        this.avg=this.totalRuns/this.InningsPlayed;
    }

    public int getAverage(){
         return this.avg;
    }

    public void display(){
        System.out.println("The player id:"+this.pId);
        System.out.println("The player name:"+this.name);
        System.out.println("The player inning played:"+this.InningsPlayed);
        System.out.println("The player not out times:"+this.NotOutTimes);
        System.out.println("The player total runs:"+this.totalRuns);
    }

    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:"); 
        int n=sc.nextInt();
        CricketPlayer c[]=new CricketPlayer[n];
        for(int i=0;i<c.length;i++){
            System.out.print("Enter id:");
            int id=sc.nextInt();
            System.out.print("Enter Innings played:");
            int in=sc.nextInt();
            System.out.print("Enter Not out times:");
            int time=sc.nextInt();
            System.out.print("Enter total runs:");
            int t=sc.nextInt();

            c[i]=new CricketPlayer(id, t,in,time);
            c[i].calculate();
        }

        System.out.println("The player having max average:");
        int max=0;
        for(int i=0;i<c.length;i++){
            if(c[i].getAverage()>max){
                max=c[i].getAverage();
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i].getAverage()==max){
                c[i].display();
            }
        }
        sc.close();
    }
}
