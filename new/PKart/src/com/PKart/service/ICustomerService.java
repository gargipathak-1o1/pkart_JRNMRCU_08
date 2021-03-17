package com.PKart.service;

import java.util.ArrayList;
import java.util.List;

import com.PKart.model.Customer;
import com.PKart.model.Product;

public interface ICustomerService {
	 boolean viewOrder(Customer customer);

	 boolean purchasePoduct(Customer customer);

	 Customer  orderDetails(int customerId);

	Customer   viewCustomer(int customerId);
	 List<Customer> getOrderDetails();

	boolean addCustomer(Customer customer);

	ArrayList<Product> purchaseProduct();
	void addToCart(Product product);
}
