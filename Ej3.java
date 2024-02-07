import java.util.ArrayList;
public class Ej3 {
    public static ArrayList<Integer> getMultiplesOfFive(int begin, inte end) {
        ArrayList<Integer> multiplesOfFive = new ArrayList<Integer>();
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplesOfFive.add(i);
            }
        }
        return multiplesOfFive;
    }
}
