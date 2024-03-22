import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        int num, fact_sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        System.out.print("Factors of " + num + " = ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }

        for (int i = 1; i <= num-1; i++) {
            if (num % i == 0) {
                fact_sum += i;
            }
            
        }

        System.out.println();
        if(num == fact_sum){
            System.out.println(num+ " is a Perfect number");
        }
        else {
            System.out.println(num+ " is not a perfect number");
        }
        sc.close();
    }
}
