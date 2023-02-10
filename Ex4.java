import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ex4 = new Scanner(System.in);
        System.out.print("Enter 1st number here : ");
        int x = ex4.nextInt();
        System.out.print("Enter 2nd number here : ");
        int y = ex4.nextInt();
        System.out.print("Enter 3rd number here : ");
        int z = ex4.nextInt();
        if (x > y) {
            if (x > z) {
                System.out.println("Maximum number is " + x);
            } else {
                System.out.println("Maximum number is " + z);
            }
        } else {
            if (y > z) {
                System.out.println("Maximum number is " + y);
            } else {
                System.out.println("Maximum number is " + z);
            }
        }
    }
}
