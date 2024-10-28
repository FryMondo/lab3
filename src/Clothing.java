import java.util.Objects;

public class Clothing {
    String type; // Тип одягу
    String brand; // Бренд одягу
    String size; // Розмір одягу
    double price; // Ціна одягу
    int rating; // Рейтинг одягу

    // Конструктор
    public Clothing(String type, String brand, String size, double price, int rating) {
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.rating = rating;
    }

    // Порівняння
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clothing that = (Clothing) obj;
        return Double.compare(that.price, price) == 0 &&
                rating == that.rating &&
                Objects.equals(type, that.type) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(size, that.size);
    }

    // Геттери для отримання значень
    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, size, price, rating);
    }

    // Виведення об'єкту
    @Override
    public String toString() {
        return "<type=" + type + ", brand=" + brand + ", size=" + size + ", price=" + price +
                ", rating=" + rating + ">";
    }
}
