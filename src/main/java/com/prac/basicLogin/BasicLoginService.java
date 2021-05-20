package com.prac.basicLogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicLoginService {
	
	@Autowired
	CustomerRepository repo;

	public List<Customers> showAllCustomers(){
		return repo.findAll();
		}
	
	public Customers addCustomer(Customers customer) {
		return repo.save(customer);
	}
	
	public void deleteCustomer(int id) {
		repo.deleteById(id);
	}
	
	
}
