package com.PKart.testcases;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.PKart.model.Customer;
import com.PKart.service.CustomerServiceImpl;

class CustomerServiceImpTest {
      private CustomerServiceImpl customerServiceImpl;
	@BeforeEach
	void setUp() throws Exception {
		 customerServiceImpl = new CustomerServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerServiceImpl =null;
	}

	@Test
	void testAddCustomer() {
			Customer customer =new Customer(101, "John","jh1@gmail.com", "12345789654", "Delhi");
		    boolean result = customerServiceImpl.addCustomer(customer);
		    assertEquals(true, result);
		}
	}