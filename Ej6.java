import java.util.Arrays;
public class Ej6 {
    public static int [] generarTabla (int num) {
        int [] tabla = new int [10];
        for (int i = 0; i < 10; i++) {
            tabla[i] = num * (i + 1);
        }
        return tabla;
    }
    public static int [][] generarTablas (int n) {
        int [][] tablas = new int [n][10];
        for (int i = 0; i < n; i++) {
            tablas[i] = generarTabla(i);
        }
        return tablas;
    }
    public static void main (String [] args) {
        int [][] tablas = generarTablas(10);
        for (int i=0; i<tablas. length; i++) {
            System.out.println("Tabla del " + i + ": " + Arrays.toString(tablas[i]));
        }
    }
}
