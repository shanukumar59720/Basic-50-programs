import java.util.Scanner;

public class fruitseller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruits[] = new String[5];
        int fruitPrice[] = new int[5];

        //get the fruits name
        System.out.print("Enter the name of 5 fruits - ");
        for( int i=0; i<fruits.length; i++){
            fruits[i] = sc.nextLine();
        }

        //get the fruits price
        System.out.print("Enter the price of 5 fruits - ");
        for( int i=0; i<fruits.length; i++){
            fruitPrice[i] = sc.nextInt();
        }

        // display the fruits and their prices
        System.out.println("The fruits and their prices are - ");
        for(int i=0 ; i<fruits.length; i++){
            System.out.println(fruits[i] + " ₹" + fruitPrice[i]);
        }

        //prompt the user to alter the fruits name and prices
        System.out.println();

        sc.close();
    }
}
