import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        int count, n1 = 0, n2 = 1, fib;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a count: ");
        count = sc.nextInt();

        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; ++i) {
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
            System.out.print(" " + fib);
        }
        sc.close();
    }
}
