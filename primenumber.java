import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        int n;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a Prime number");
        }

        sc.close();
    }
}
