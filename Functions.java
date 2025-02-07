import java.util.Scanner;

public class Functions {

    public static int getAnIntFromTheUser(Scanner sc) {
        System.out.print("Enter an integer: ");
        return sc.nextInt();
    }

    public static void compareTwoInts(int a, int b) {
        if (a > b)
            System.out.println(a + " is greater than " + b);
        else if (a < b)
            System.out.println(a + " is less than " + b);
        else
            System.out.println(a + " is equal to " + b);
    }

    public static int sumTwoInts(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = getAnIntFromTheUser(sc);
        int num2 = getAnIntFromTheUser(sc);

        compareTwoInts(num1, num2);

        int sum = sumTwoInts(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}