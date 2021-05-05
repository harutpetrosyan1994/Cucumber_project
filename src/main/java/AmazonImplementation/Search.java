package AmazonImplementation;

public class Search {

    public String displayProduct(Products products){
        if (products.getProductList().contains(products.getProductName())){
           return products.getProductName();
        }
        return null;
    }
}
