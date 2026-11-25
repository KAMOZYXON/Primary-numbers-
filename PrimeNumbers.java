public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println("Prime numbers between 0 and 500:");

        for (int i = 2; i <= 500; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
