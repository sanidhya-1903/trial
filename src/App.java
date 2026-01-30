import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a, b;
        if (args.length >= 2) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first integer: ");
            a = sc.nextInt();
            System.out.print("Enter second integer: ");
            b = sc.nextInt();
            sc.close();
        }

        int sum = B.add(a, b);
        int product = C.multiply(a, b);
        int difference = D.subtract(a, b);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
    }
}
