import java.util.Scanner;

public class Main {

    public static double mayor(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static String comparar(double a, double b) {
        if (a == b) {
            return "0";
        } else if (a > b) {
            return "1";
        } else {
            return "-1";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("El número mayor es: " + mayor(num1, num2));
        System.out.println("La comparación de los números es: " + comparar(num1, num2));
    }
}
