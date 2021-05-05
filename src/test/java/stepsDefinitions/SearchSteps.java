package stepsDefinitions;

import AmazonImplementation.Products;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps  {
    Products products;
    Search search;
    @Given("I Have a search field on Amazon Page")
    public void i_have_a_search_field_on_amazon_page() {
        System.out.println("Step :1 I am on search page");
    }
    @When("I search for a product with name {string} and Price {int}")
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
        System.out.println("Step :2 Search the product with name "+productName+" price: "+price);
        products=new Products(productName,price);
    }
    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        System.out.println("Step :3 product "+productName+" is displayed");
        search=new Search();
        String name=search.displayProduct(products);
        System.out.println("searched product is : "+name);
        Assert.assertEquals(products.getProductName(),name);

    }

}
