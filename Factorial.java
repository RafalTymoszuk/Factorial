import java.util.Scanner;

public class Factorial {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        factorialCalculator();

    }

    public static void factorialCalculator() {
        System.out.println("Calculate factorial from number: ");
        int x = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= x; i++) {
            sum *= i;

        }

        System.out.println("Factorial: " + x + " = " + sum);
    }

}
