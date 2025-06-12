public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1800.0, 10);
        Customer customer = new Customer("Narantuya", "naraa@email.com", "99112233");
        OrderItem item = new OrderItem(laptop, 2);

        customer.displayInfo();
        item.displayItem();
    }
}
