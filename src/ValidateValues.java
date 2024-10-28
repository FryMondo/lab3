public class ValidateValues {
    // Валідація значень в об'єкті
    public static void validateClothing(Clothing clothing) {
        if (clothing == null) {
            throw new IllegalArgumentException("Об'єкт Clothing не може бути null");
        }

        validateStringField(clothing.type, "type");
        validateStringField(clothing.brand, "brand");
        validateStringField(clothing.size, "size");

        validatePrice(clothing.price);
        validateRating(clothing.rating);
    }

    // Перевірка рядкових полів (не можуть бути порожніми або null)
    private static void validateStringField(String field, String fieldName) {
        if (field == null || field.trim().isEmpty()) {
            throw new IllegalArgumentException("Field " + fieldName + " cannot be empty or null");
        }
    }

    // Перевірка поля price (повинно бути додатнім числом)
    private static void validatePrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Field prices should be greater than 0");
        }
    }

    // Перевірка поля rating (повинно бути в діапазоні від 1 до 5)
    private static void validateRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Field rating should be between 1 and 5");
        }
    }
}
