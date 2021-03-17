package com.PKart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.model.Product;
import com.PKart.service.ProductServiceImpl;

class ProductServiceImplTest {
	private ProductServiceImpl productServiceImpl;
  
	
	@BeforeEach
	void setUp() throws Exception {
		setProductServiceImpl(new ProductServiceImpl());
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddProduct() {
		Product product =new Product(101, "Soap", 30, 1, "20/02/2019", "10/02/2021");
	    boolean result = productServiceImpl.addProduct(product);
	    assertEquals(true, result);
	}

	public ProductServiceImpl getProductServiceImpl() {
		return productServiceImpl;
	}

	public void setProductServiceImpl(ProductServiceImpl productServiceImpl) {
		this.productServiceImpl = productServiceImpl;
	}

}