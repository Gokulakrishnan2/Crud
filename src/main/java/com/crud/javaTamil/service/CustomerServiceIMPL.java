package com.crud.javaTamil.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.crud.javaTamil.DTO.CustomerDTO;
import com.crud.javaTamil.DTO.CustomerSaveDTO;
import com.crud.javaTamil.DTO.CustomerUpdateDTO;
import com.crud.javaTamil.Entity.Customer;
import com.crud.javaTamil.customerRepo.CustomerRepo;

@Service

public class CustomerServiceIMPL implements CustomerService{

	@Autowired
	private CustomerRepo customerRepo;
	
	
	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(
					customerSaveDTO.getCustomerName(),
					customerSaveDTO.getMobile(),
					customerSaveDTO.getCustomeAddress()					
				);
		
		customerRepo.save(customer);
		return customer.getCustomerName();
				
	}


	@Override
	public List<CustomerDTO> getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> getCustomer = customerRepo.findAll();
		List<CustomerDTO> customerDTOList = new ArrayList<>();
		for(Customer a:getCustomer) {
			CustomerDTO customerDTO = new CustomerDTO(
					
					a.getCustomerID(),
					a.getCustomeAddress(),
					a.getMobile(),	
					a.getCustomerName()
					
					
					);
			customerDTOList.add(customerDTO);
		}
		return customerDTOList;
	}


	@Override
	public String updateCustomer(CustomerUpdateDTO customerUpdateDTO) {
		// TODO Auto-generated method stub
		if(customerRepo.existsById(customerUpdateDTO.getCustomerID())) {
			
			Customer customer = customerRepo.getById(customerUpdateDTO.getCustomerID());
		
		
			customer.setCustomerName(customerUpdateDTO.getCustomerName());
			customer.setCustomeAddress(customerUpdateDTO.getCustomeAddress());
			customer.setMobile(customerUpdateDTO.getMobile());
			customerRepo.save(customer);
		
	}else {
		System.out.println("Customer ID do not Exist");

	}

		return null;

	}


	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		if(customerRepo.existsById(id)) {
			customerRepo.deleteById(id);
		}
		else {
			System.out.println("customer id mot found");
		}
		return true;
	}
	
}
