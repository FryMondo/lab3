public class Main {
    public static void main(String[] args) {
        // Створюємо масив об'єктів
        Clothing[] array = {
                new Clothing("Shirt", "Nike", "M", 19.99, 4),
                new Clothing("Shirt", "Adidas", "L", 21.99, 5),
                new Clothing("Pants", "Nike", "M", 25.50, 3),
                new Clothing("Shirt", "Nike", "M", 19.99, 5),
                new Clothing("Pants", "Puma", "S", 30.00, 2)
        };

        try {
            // Валідація значень
            for (Clothing item : array) {
                ValidateValues.validateClothing(item);
            }
            // Сортування
            // Поля за якими буде відбуватися сортування
            String field1 = "type";
            String field2 = "price";
            // Сортуємо за полями field1 (зростання) та field2 (спадання)
            Sorting.sortClothingArray(array, ValidateFields.compareFields(field1, field2));
            System.out.println("Sorted array by field1 = " + field1 + " and by field2 = " + field2 + ": ");
            for (Clothing item : array) {
                System.out.println(item);
            }
            // Пошук об'єкту
            // Задані значення для пошуку
            Clothing target = new Clothing("Shirt", "Nike", "M", 19.99, 4);
            // Пошук ідентичного об'єкта
            boolean found = Find.findClothing(array, target);
            System.out.println("\nDoes this array exist \"" + target + "\": \n" + found);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
