package com.crud.javaTamil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.javaTamil.DTO.CustomerDTO;
import com.crud.javaTamil.DTO.CustomerSaveDTO;
import com.crud.javaTamil.DTO.CustomerUpdateDTO;
import com.crud.javaTamil.service.CustomerService;

@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController {
	 
	@Autowired
	private CustomerService customerService; 
	
	@PostMapping(path="/create")
	public String saveCustomer(@RequestBody CustomerSaveDTO CustomerSaveDTO) {
		System.out.println("saved");
		String id = customerService.addCustomer(CustomerSaveDTO);
		return id;
	}
	
	@GetMapping(path="/getCustomer")
	public List<CustomerDTO> getAllCustomer(){
		System.out.println("get");
		List<CustomerDTO> AllCustomer = customerService.getAllCustomer();
		return AllCustomer;
	}
	
	@PostMapping(path="/update")
	public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO) {
		System.out.println("update");
		String id = customerService.updateCustomer(customerUpdateDTO);
		return id;
	}
	
	@DeleteMapping(path="/delete/{id}")
	public String deleteCustomer(@PathVariable(value="id") int id) {
		System.out.println("delete");
		boolean deletecustomer = customerService.deleteCustomer(id);
		return id+" deleted";
	}
}
