package jb29.unit9.classes;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {

	private List<Customer> customers;

	public CustomerList() {
		customers = new ArrayList<Customer>();
	}

	public void add(Customer customer) {

		customers.add(customer);
	}

	public void remove(Customer customer) {

		customers.remove(customer);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	@Override
	public String toString() {
		return "CustomerList [customers=" + customers + "]";
	}

}
