package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Products {
    String productName;
    int price;

    public Products(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public List<String> getProductList(){
        List<String> productList=new ArrayList<>();
        productList.add("Apple MacBook PRO");
        productList.add("Apple MacBook AIR");
        productList.add("Apple iPhone 12");
        productList.add("Iphone");
        return productList;
    }
}
