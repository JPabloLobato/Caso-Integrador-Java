import java.util.ArrayList;
import java.util.Scanner;
public class Ej7 {
    public static ArrayList<Integer> descomponerEnFactoresPrimos (int num) {
        ArrayList <Integer> factoresPrimos = new ArrayList <> ();
        for (int i = 2; i<=num; i++) {
            while (num % i == 0) {
                factoresPrimos.add(i);
                num /= i;
            }
        }
        return factoresPrimos;
    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Ingrese un número entero: ");
        int num = scanner.nextInt();
        ArrayList <Integer> factoresPrimos = descomponerEnFactoresPrimos(num);
        System.out.println("Los factores primos de " + num + " son: " + factoresPrimos);
    }
}
