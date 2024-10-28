import java.util.Comparator;

public class ValidateFields {
    public static Comparator<Clothing> compareFields(String field1, String field2) {
        // Перевірка правильності полів і їх порядку - друге поле не може бути перед першим
        Comparator<Clothing> comparator = switch (field1) {
            case "type" -> {
                if (!field2.equals("brand") && !field2.equals("size") && !field2.equals("price")
                        && !field2.equals("rating"))
                    throw new IllegalArgumentException("Invalid second field after 'type'");
                yield Comparator.comparing(Clothing::getType);
            }
            case "brand" -> {
                if (!field2.equals("size") && !field2.equals("price") && !field2.equals("rating"))
                    throw new IllegalArgumentException("Invalid second field after 'brand'");
                yield Comparator.comparing(Clothing::getBrand);
            }
            case "size" -> {
                if (!field2.equals("price") && !field2.equals("rating"))
                    throw new IllegalArgumentException("Invalid second field after 'size'");
                yield Comparator.comparing(Clothing::getSize);
            }
            case "price" -> {
                if (!field2.equals("rating"))
                    throw new IllegalArgumentException("Invalid second field after 'price'");
                yield Comparator.comparingDouble(Clothing::getPrice);
            }
            case "rating" -> throw new IllegalArgumentException("'rating' cannot have a second field after it");
            default -> throw new IllegalArgumentException("Invalid first field");
        };

        // Другий компаратор для сортування за спаданням
        comparator = switch (field2) {
            case "brand" -> comparator.thenComparing(Clothing::getBrand, Comparator.reverseOrder());
            case "size" -> comparator.thenComparing(Clothing::getSize, Comparator.reverseOrder());
            case "price" -> comparator.thenComparingDouble((Clothing c) -> -c.getPrice());
            case "rating" -> comparator.thenComparingInt((Clothing c) -> -c.getRating());
            default -> comparator;
        };
        return comparator;
    }
}
