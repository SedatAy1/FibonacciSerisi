import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonecci serisi kaç eleman içerecek? : ");
        int n = scanner.nextInt();

        if (n<0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else {
            if (n == 0) {
                System.out.println("Fibonacci serisi: ");
            }else if (n == 1) {
                System.out.println("Fibonacci serisi : 0");
            }else {
                System.out.println("Fibonacci serisi : 0, 1");
                int a = 0;
                int b = 1;

                for (int i = 2; i < n; i++) {
                    int next = a+b;

                    System.out.println(", " + next);
                    a = b;
                    b = next;
                }
                System.out.println();
            }
        }
    }
}
