import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers- ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("According to the number given- ");
        System.out.println("First number = " + a);
        System.out.println("First number = " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("After swapping numbers are- ");
        System.out.println("First number = " + a);
        System.out.println("First number = " + b);

        sc.close();
    }
}
