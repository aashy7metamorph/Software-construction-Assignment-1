package Fig1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        List<LineItem> items = new ArrayList<>();
        items.add(new LineItem("Laptop", 1000, 1));
        items.add(new LineItem("Mouse", 50, 2));

        Order order = new Order(taxCalculator, items, "USA", "California", "Los Angeles");

        System.out.println("Order Total (including tax): $" + order.getOrderTotal());
    }
}
