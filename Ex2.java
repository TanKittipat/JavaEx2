import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ex2 = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter number here : ");
            num = ex2.nextInt();

        } while (num <= 0);
        System.out.println("Your number is " + num);
        ex2.close();
    }

}
