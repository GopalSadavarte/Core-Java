/*2. Define a class product(pid,p name,price). Write a function to accept the product details, to 
display product details and to calculate total amount. (use array of Objects) 
 */
class Product{
    private int pId;
    private double price;
    private String name;
    static double total;

    Product(int productId,String name,double price){
        this.pId=productId;
        this.name=name;
        this.price=price;
        Product.total+=this.price;
    }

    void display(){
        System.out.println("----The product details-----");
        System.out.println("Product id:"+this.pId);
        System.out.println("Name:"+this.name);
        System.out.println("Price:"+this.price);
        System.out.println("-------------------------------");
    }
}
public class ArrayOfObjectsWithStatic {
    public static void main(String[] args) {
        Product p[]=new Product[5];
        int ids[]={1,2,3,4,5};
        String names[]={"sugar","almond","cashew","peanuts","soap"};
        double prices[]={35d,540d,600.50,120d,10d};
        for (int i = 0; i < p.length; i++) {
            p[i]=new Product(ids[i], names[i], prices[i]);
        }

        System.out.println("-------Products DATA-----------");
        for (int i = 0; i < p.length; i++) {
            p[i].display();
        }

        System.out.println("The Total is:"+Product.total);
    }
}
