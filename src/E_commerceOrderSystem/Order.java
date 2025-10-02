package E_commerceOrderSystem;

import java.util.List;

public class Order {
    int orderNo;
    int discount;
    List<Product> productList;

    public  Order(int orderNo, int discount, List<Product> productList){
        this.orderNo = orderNo;
        this.discount =discount;
        this.productList = productList;
    }

    public  void orderInformation(){
        System.out.println("Order no:"+ orderNo);
        for (Product p : productList){
            System.out.println("Product name :"+p.getProductName()+ " Price :"+p.getProductPrice());
        }
    }

    public void totalPrice(){
        int tPrice = 0;
        for (Product p : productList){
            tPrice += p.getProductPrice();
        }
        System.out.println("Total Price :"+tPrice);
        tPrice -= (tPrice*discount)/100;
        System.out.println("Discount price:"+tPrice);
    }
}

