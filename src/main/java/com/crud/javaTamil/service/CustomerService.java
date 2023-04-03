package com.crud.javaTamil.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.crud.javaTamil.DTO.CustomerDTO;
import com.crud.javaTamil.DTO.CustomerSaveDTO;
import com.crud.javaTamil.DTO.CustomerUpdateDTO;

@Service

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);

	List<CustomerDTO> getAllCustomer();

	String updateCustomer(CustomerUpdateDTO customerUpdateDTO);

	boolean deleteCustomer(int id);

}
