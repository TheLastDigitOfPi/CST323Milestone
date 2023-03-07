package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Creates the ProductModel Class
 * @author connorrolstad
 *
 */
public class ProductModel {
	
//  Set up variables for each product and proper validation
	
	/**
	 * Represents a food's name
	 */
	@NotNull(message="Product Name is a required field")
	@Size(min=1, max=32, message="Food Name must be between 1 and 32 characters")
	private String name;
	/**
	 * Represents a food's type
	 */
	@NotNull(message="type is a required field")
	@Size(min=1, max=32, message="Type must be between 1 and 32 characters")
	private String type;
	/**
	 * Represents a food's price
	 */
	@NotNull(message="price is a required field")
	@Size(min=1, max=10, message="Price must be between 1 and 10 numbers")
	private String price;
	/**
	 * Represents a foods description
	 */
	@NotNull(message="description is a required field")
	@Size(min=1, max=200, message="Description must be between 1 and 200 characters")
	private String description;
	/**
	 * Represents the link to an image
	 */
	@NotNull(message="Food Image Address is a required field")
	@Size(min=1, max=1000000, message="Food Image Address must be between 1 and 1000000 characters")
	private String image;
	/**
	 * Represents a unique product identifier
	 */
	private int productId;
	
	
	/**
	 * Non-default constructor for ProductModel
	 * @param name String passed in
	 * @param type String passed in
	 * @param price Double passed in
	 * @param description String passed in
	 * @param productId int for the id of the product
	 * @param image String for image address
	 */
	public ProductModel(int productId, String name, String type, String price, String description, String image) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.description = description;
		this.productId = productId;
		this.image = image;
	}

	/**
	 * Default constructor for ProductModel
	 */
	public ProductModel() {
		
	}

	/**
	 * getter for product name
	 * @return name string of product
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter for product name
	 * @param name to set product to
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for product type
	 * @return the type of the product
	 */
	public String getType() {
		return type;
	}

	/**
	 * setter for product genre
	 * @param genre to set product to
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * getter for price of the product
	 * @return the price for the product
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * setter for price of product
	 * @param price to set product to
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	
	/**
	 * getter for description of the product
	 * @return the description for the product
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * setter for description of product
	 * @param description to set product to
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * getter for product id
	 * @return the productId int
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * setter for product id
	 * @param productId to set product to
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * getter for the image address of the product
	 * @return the image address string
	*/
	public String getImage() {
		return image;
	}

	/**
	 * setter for product image address
	 * @param image to set product to
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
