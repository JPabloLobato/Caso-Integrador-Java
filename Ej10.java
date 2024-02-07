import java.util.Random;
import java.util.Scanner;
public class Ej10 {
    public static void generarEImprimirMatrizSimetrica() {
        Scanner scan = new Scanner (System.in);
        Random random = new Random();
        System.out.println ("Ingrese el tamaño de la matriz cuadrada");
        int n = scan.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int aleatorio = random.nextInt(100);
                matriz[i][j] = aleatorio;
                matriz[j][i] = aleatorio;
            }
        }
        System.out.println("Matriz generada: ");
        for (int i = 0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        generarEImprimirMatrizSimetrica();
    }
}
