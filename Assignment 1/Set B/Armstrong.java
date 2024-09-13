import java.util.*;

public class Armstrong{
    public static final Scanner input = new Scanner(System.in);
    private ArrayList<Integer> arr;
    private int length;

    // Constructor to initialize and find Armstrong numbers
    public Armstrong(int len) {
        this.length = len;
        this.arr = new ArrayList<Integer>(); // Initialize the ArrayList

        // Loop through input numbers
        for (int i = 0; i < this.length; i++) {
            System.out.println("Enter " + (i + 1) + " array element:");
            int temp = Armstrong.input.nextInt();
            if (this.isArmstrong(temp)) {
                this.arr.add(temp); // Add Armstrong number to the list
            }
        }
    }

    // Method to check if a number is Armstrong
    private boolean isArmstrong(int num) {
        int len = Integer.toString(num).length();
        double sum = 0;
        int temp1 = num;

        while (temp1 > 0) {
            int digit = temp1 % 10;
            sum += Math.pow(digit, len); // Sum of digits raised to the power of length
            temp1 = temp1 / 10;
        }

        return num == sum;
    }

    // Display the Armstrong numbers
    public void display() {
        if (this.arr.isEmpty()) {
            System.out.println("Armstrong numbers not found!");
        } else {
            System.out.println("Armstrong numbers:");
            for (int i = 0; i < this.arr.size(); i++) {
                System.out.print(this.arr.get(i) + "\t"); // Correct string concatenation
            }
            System.out.println(); // Move to the next line after printing all numbers
        }
    }

    // Main method to run the program
    public static final void main(String[] s) {
        System.out.println("Enter length of array:");
        int len = Armstrong.input.nextInt();

        Armstrong a = new Armstrong(len);
        a.display();
    }
}
