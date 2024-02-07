import java.util.ArrayList;
import java.util.Scanner;
public class Ej8 {
    public static ArrayList<Integer> recibirNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        int num;
        System.out.println ("Ingrese un número, al final introduce un 0: ");
        do {
            num = scanner.nextInt();
            if (num != 0) {
                numeros.add(num);
            }
        } while (num != 0);
        return numeros;
        }
        public static double calcularMedia(ArrayList<Integer> numeros) {
            double suma = 0;
            for (int i = 0; i < numeros.size(); i++) {
                suma += numeros.get(i);
            }
            return suma / numeros.size();
        }
        public static int calcularMinimo(ArrayList<Integer> numeros) {
            int min= numeros.get(0);
            for (int i = 1; i < numeros.size(); i++) {
                if (numeros.get(i) < min) {
                    min = numeros.get(i);
                }
            }
            return min;
        }
        public static int calcularMaximo(ArrayList<Integer> numeros) {
            int max = numeros.get(0);
            for (int i = 1; i < numeros.size(); i++) {
                if (numeros.get(i) > max) {
                    max = numeros.get(i);
                }
            }
            return max;
        }
        public static void main(String[] args) {
            ArrayList<Integer> numeros = recibirNumeros();
            System.out.println("La media es: " + calcularMedia(numeros));
            System.out.println("El mínimo es: " + calcularMinimo(numeros));
            System.out.println("El máximo es: " + calcularMaximo(numeros));

    }
}
