/*4. Define a class MyNumber having one private integer data member. Write a default 
constructor to initialize it to 0 and another constructor to initialize it to a value. Write 
methods isNegative, isPositive. Use command line argument to pass a value to the object 
and perform the above tests.  */
class MyNumber{
    private int number;
    MyNumber(){
        number=0;
    }

    MyNumber(int num){
        number=num;
    }

    public int get(){
        return number;
    }

    public boolean isNegative(){
        // if(number<0){
        //     return true;
        // }else{
        //     return false;
        // }

        //simplify using turnery operator
        return (number<0)?true:false;
    }

    public boolean isPositive(){
        if(number>0){
            return true;
        }else{
            return false;
        }
    }
}
public class CmdWithMyNumber {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        MyNumber number=new MyNumber(num);
        if(number.isNegative()){
            System.out.printf("The number %d is negative!",number.get());
        }

        if(number.isPositive()){
            System.out.printf("The number %d is positive!",number.get());
        }
    }
}
