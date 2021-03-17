package com.PKart.testcases;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.dao.CustomerDaoImpl;
import com.PKart.model.Customer;

class CustomerDaoImplTest {
     private CustomerDaoImpl customerDao;
	@BeforeEach
	void setUp() throws Exception {
		customerDao = new CustomerDaoImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerDao = null;
	}

	@Test
	void testViewCustomer() {
		Customer customer = new Customer(101, "John","jh1@gmail.com", "12345789654", "Delhi");
		customerDao.addCustomer(customer);
		Customer cust = customerDao.viewCustomer(101);
		assertEquals(customer.getId(), cust.getId());
		System.out.println("Pass!!!");	
	}
	@Test
	void testViewCustomerInValid() {
		Customer customer = new Customer(101, "John","jh1@gmail.com", "12345789654", "Delhi");
		Customer.addCustomer(customer);
		Customer cust = Customer.viewCustomer(11);
		assertNotEquals("Fail",customer, cust);
		System.out.println("Failed!!!");	
	}
}
