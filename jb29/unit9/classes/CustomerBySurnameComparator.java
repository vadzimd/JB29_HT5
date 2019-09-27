package jb29.unit9.classes;

import java.util.Comparator;

public class CustomerBySurnameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {

		return o1.getSurname().compareTo(o2.getSurname());
	}

}
