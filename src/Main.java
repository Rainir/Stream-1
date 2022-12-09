import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        System.out.println(arraySort(intList));
    }

    public static List<Integer> arraySort(List<Integer> intList) {
        List<Integer> sortedList = new ArrayList<>();
        List<Integer> parityList = new ArrayList<>();

        for (int entry : intList) {
            if (entry > 0) {
                sortedList.add(entry);
            }
        }

        for (int entry : sortedList) {
            if (entry % 2 == 0) {
                parityList.add(entry);
            }
        }

        parityList.sort(Comparator.naturalOrder());
        return parityList;
    }

 }