package com.capg.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.beans.Customer;

public class CustomerDAO {
	Map<Integer, Customer> map = new HashMap<Integer, Customer>();

	public boolean addCustomer(Customer c) {
		map.put(c.getCid(),c );
		if (c != null) {
			return true;
		} else {
			return false;
		}
	}

	public Map getData() {
		return map;
	}
}
