import java.util.Scanner;

/**
 * Ex1
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner ex1 = new Scanner(System.in);
        System.out.print("Enter number here : ");
        int num = ex1.nextInt();
        ex1.close();
        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }

}