package LamdaExpressionShoppingChart;

import java.util.Arrays;
import java.util.List;

public class ProductList {
    String name;
    int price;

    public ProductList(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void calculateTotalPrice(List<ProductList> productLists){
        int totalPrice = 0;
        for (int i = 0 ; i<productLists.size(); i++){
            totalPrice +=productLists.get(i).price;
        }
        System.out.println("Total Price:"+totalPrice);
    }
}

class Main{
    public static void main(String[] args) {
        List<ProductList> lists = Arrays.asList(
                new ProductList("Mango", 500),
                new ProductList("Rice", 1000),
                new ProductList("Shirt", 2000),
                new ProductList("Pant", 1500)
        );
        System.out.println("Output By Method:");
       new ProductList("nothing", 0).calculateTotalPrice(lists);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        int total1 = lists.stream().mapToInt(n->n.price).sum();
        System.out.println("Lambda Result:");
        System.out.println(total1);
    }
}
