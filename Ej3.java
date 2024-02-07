import java.util.ArrayList;
public class Ej3 {
    public static ArrayList<Integer> getMultiplesOfFive(int begin, int end) {
        ArrayList<Integer> multiplesOfFive = new ArrayList<Integer>();
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplesOfFive.add(i);
            }
        }
        return multiplesOfFive;
    }
    public static int sumArray(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> multiplesOfFive = getMultiplesOfFive (1, 100);
        int sum = sumArray(multiplesOfFive);
        System.out.println("Los múltiplos de 5 entre 1 y 100 son: " + multiplesOfFive);
        System.out.println("Hay " + multiplesOfFive.size() + " multiplos de 5 entre 1 y 100.");
        System.out.println("La suma de los múltiplos de 5 entre 1 y 100 es: " + sum + ".");
    }
}
