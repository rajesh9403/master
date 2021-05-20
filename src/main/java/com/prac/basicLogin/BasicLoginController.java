package com.prac.basicLogin;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicLoginController {
	
	@Autowired
	BasicLoginService service;
	
	
	@PostMapping("/register")
	public ResponseEntity<String> addCustomer() {
		
		 service.addCustomer(new Customers(1, "Rajesh", "Bramhapuri"));
		 service.addCustomer(new Customers(2, "Rajsh", "Bramhapuri"));
		 service.addCustomer(new Customers(3, "Rajes", "Bramhapuri"));
		 return new ResponseEntity<String>(HttpStatus.OK);
	}
	@GetMapping("/showAll")
	public List<Customers> getAllCustomers(){
		return service.showAllCustomers();
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteCustomer() {
		service.deleteCustomer(1);
		return "Customer deleted";
	}

}
