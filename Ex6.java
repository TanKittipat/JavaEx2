public class Ex6 {
    public static void main(String[] args) {
        int answer = 1;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                answer = answer * i;
            }

        }
        System.out.println("The multiple of even number of 1 to 100 is ");
        System.out.print(answer);
    }
}
