package jb29.unit9.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task08 {

	public static void main(String[] args) {

		CustomerList customerList = new CustomerList();

		customerList.add(new Customer(1, "Ivanou", "Ivan", "Ivan", "Moscow", 45789, "IBAN145780124893358974"));
		customerList.add(new Customer(2, "Smirnou", "Piotr", "Maksym", "Kyiv", 1002, "IBAN1457553443124893358974"));
		customerList.add(new Customer(3, "Sidarau", "Mikita", "Mikita", "Minsk", 14752, "IBAN1457553444787783358974"));

		System.out.println(customerList);

		System.out.println(findCardNumbers(customerList, 2000, 100000));

		System.out.println(sortBySurname(customerList));
	}

	public static List<Customer> findCardNumbers(CustomerList custList, int cardNumberMin, int cardNumberMax) {

		List<Customer> customerList;
		List<Customer> customerListResult = new ArrayList<Customer>();

		Customer customer;

		customerList = custList.getCustomers();

		for (int i = 0; i < customerList.size(); i++) {
			customer = customerList.get(i);

			if (customer.getCardNumber() >= cardNumberMin && customer.getCardNumber() <= cardNumberMax) {

				customerListResult.add(customer);
			}
		}

		return customerListResult;

	}

	public static List<Customer> sortBySurname(CustomerList custList) {

		List<Customer> customerList;

		customerList = custList.getCustomers();

		Collections.sort(customerList, new CustomerBySurnameComparator());

		return customerList;

	}

}
