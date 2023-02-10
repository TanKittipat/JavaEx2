public class Ex6 {
    public static void main(String[] args) {
        double answer = 1;
        System.out.println("The multiple of even number of 1 to 100 is");
        for (double i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                answer = answer * i;
                System.out.println(answer);
            }

        }
    }
}
