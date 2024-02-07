import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num;

        System.out.println("Introduce números enteros positivos. Para terminar, introduce un número negativo.");

        do {
            num = scanner.nextInt();

            if (num >= 0) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
        } while (num >= 0);

        System.out.println("El número máximo introducido es: " + max);
        System.out.println("El número mínimo introducido es: " + min);
    }
}