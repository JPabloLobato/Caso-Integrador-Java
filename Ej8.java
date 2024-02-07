import java.util.ArrayList;
import java.util.Scanner;
public class Ej8 {
    public static ArrayList<Integer> recibirNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        int num;
        System.out.prrintln ("Ingrese un número, al final introduce un 0: ");
        do {
            num = scanner.nextInt();
            if (num != 0) {
                numeros.add(num);
            }
        } while (num != 0);
        return numeros;
        }
        public static double calcular Media(ArrayList<Integer> numeros)
    }
}
