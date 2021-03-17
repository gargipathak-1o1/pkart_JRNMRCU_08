package com.PKart.controller;
import java.util.List;
import java.util.Scanner;

import com.PKart.model.Customer;
import com.PKart.model.Product;
import com.PKart.service.ICustomerService;
import com.PKart.service.CustomerServiceImpl;
import com.PKart.service.IProductService;
import com.PKart.service.ProductServiceImpl;

public class AdminController {

	private static IProductService productService;
	private static ICustomerService customerService;

	public AdminController() {

		if (null == productService) {
			productService = new ProductServiceImpl();
		}
		if (null == customerService) {
			customerService = new CustomerServiceImpl();
		}
	}

	public void operations() {

		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			System.out.println("------Admin Operations----");

			System.out.println("1. Add new Product \n 2.Update existing Product \n 3.View Product \n 4.View All Products \n 5.View Customer \n 6.View Customer OrderDetails 7.Exit");
			System.out.println("Enter the choice:");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter product id, Name,Price, Quantity, MfDate, EXDate: ");
				int id = scanner.nextInt();
				String name = scanner.next();
				double price = scanner.nextDouble();
				int quantity = scanner.nextInt();
				String mfDate = scanner.next();
				String exDate = scanner.next();

				Product p = new Product();
				p.setId(id);
				p.setName(name);
				p.setPrice(price);
				p.setQuantity(quantity);
				p.setMfDate(mfDate);
				p.setExDate(exDate);

				if (productService.addProduct(p)) {
					System.out.println("Product added successfully.");
				} else {
					System.out.println("Product not added.");
				}
				break;

			case 2:
				Product pro = new Product();
				System.out.println("Enter product id which want to update:");
				int id1 = scanner.nextInt();
				System.out.println("Enter product name, price,quantity,  MFDate, EXDate ");
				String name1 = scanner.next();
				double price1 = scanner.nextDouble();
				int quantity1 = scanner.nextInt();
				String mfDate1 = scanner.next();
				String exDate1 = scanner.next();
				pro.setId(id1);
				pro.setName(name1);
				pro.setPrice(price1);
				pro.setQuantity(quantity1);
				pro.setMfDate(mfDate1);
				pro.setExDate(exDate1);
				
				
				productService.updateProduct(id1, pro);
		
				break;

			case 3:
				System.out.println("Enter product id:");
				id1 = scanner.nextInt();
				Product product1 = productService.viewProduct(id1);
				System.out.println(product1);
				break;
			case 4:
				List<Product> allProducts = productService.viewAllProduct();

				for (Product prod : allProducts) {
					System.out.println(prod);
				}
				break;
			case 5:
				System.out.println("Enter product Customer id:");
				id1  = scanner.nextInt();
				Customer customer = customerService.viewCustomer(id1);
				System.out.println(customer);
				break;
			case 6:
				System.out.println("Enter product id:");
				id1  = scanner.nextInt();
				Customer customer1 = customerService.orderDetails(id1);
				System.out.println(customer1);
			case 7:
				System.out.println("Exiting admin operations..!");
				status = false;

			}
		}

	

	}
}
