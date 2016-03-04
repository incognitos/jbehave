package org.incognitos.jbehave_demo;

import java.util.List;

import org.incognitos.jbehave_demo.Product;
import org.incognitos.jbehave_demo.ShoppingCart;
import org.incognitos.jbehave_demo.User;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddProductToShoppingCart extends BaseStory {
	private final Logger logger = LoggerFactory.getLogger(AddProductToShoppingCart.class);
	private User user;
	private ShoppingCart shoppingCart;
	private Product product;

	@Given("a user")
	public void givenAUser() {
		user = new User();
		logger.info("Initialised user... {}", user);
	}

	@Given("a shopping cart")
	public void givenAShoppingCart() {
		shoppingCart = new ShoppingCart();
		logger.info("Initialised shopping cart... {}", shoppingCart);
	}

	@Given("a product")
	public void givenAProduct() {
		product = new Product();
		product.setName("Coffee");
	}

	@When("the user adds the product to the shopping cart")
	public void userAddsProductToShoppingCart() {
		shoppingCart.add(user, product);
	}

	@Then("the product must be included in the list of the shoppingcart's entries")
	public void productMustBeListed() {
		List<Product> entries = shoppingCart.getProductsByUser(user);
		Assert.assertTrue(entries.contains(product));
	}
}
