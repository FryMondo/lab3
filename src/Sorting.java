import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static void sortClothingArray(Clothing[] array, Comparator<Clothing> compare) {
        // Сортування масиву
        Arrays.sort(array, compare);
    }
}
