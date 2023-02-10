import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner ex3 = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter number here : ");
            num = ex3.nextInt();

        } while (num % 2 == 0);
        System.out.println("*********************************");
        System.out.println(num + " is odd number");
    }
}
