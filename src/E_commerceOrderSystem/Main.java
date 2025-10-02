package E_commerceOrderSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> p1 = Arrays.asList(
                new Product("Mango", 1000),
                new Product("Shirt", 2000)
        );
        Order order = new Order(1,20,p1);
        order.orderInformation();
        order.totalPrice();

        List<Product> p2 =Arrays.asList(
                new Product("Mango2", 500),
                new Product("Shrit 2", 1000)
        );

        Order order2 = new Order(2,10,p2);
        order2.orderInformation();
        order2.totalPrice();
    }
}
