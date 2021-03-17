package com.PKart.controller;

import java.util.Scanner;

import com.PKart.util.InputUtil;
public class MainController {

	public static void main(String[] args) {

		runApplication();

	}

	private static void runApplication() {

		Scanner scanner = InputUtil.getScanner();
		System.out.println("||--   Welcome to PKart  --||");
		System.out.println("1. Customer \n 2.Admin \n   3.Exit");

		System.out.println("Enter your choice:");
		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			CustomerController customerController = new CustomerController();
			customerController.operations();
			break;

		case 2:
			AdminController adminController = new AdminController();
			adminController.operations();
			break;
		case 3:
			System.out.println("Sign Out");
			System.exit(1);
			

		}

	}
}
