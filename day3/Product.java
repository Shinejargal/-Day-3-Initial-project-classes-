public class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: $" + price + ", Stock: " + stockQuantity);
    }
}
