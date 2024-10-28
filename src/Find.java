import java.util.Arrays;

public class Find {
    public static boolean findClothing(Clothing[] array, Clothing target) {
        return Arrays.asList(array).contains(target);
    }
}
