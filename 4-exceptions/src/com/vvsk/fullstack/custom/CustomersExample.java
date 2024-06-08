package com.vvsk.fullstack.custom;

import java.util.List;
import java.util.Optional;

/**
 * Demonstrate User Defined Exceptions using Customers Example
 */
public class CustomersExample {

	public static void main(String[] args) {
		
		List<Customer> customers = List.of(
				new Customer(101,"Customer1",30, 'M',true),
				new Customer(102,"Customer2",40, 'F',true),
				new Customer(103,"Customer3",50, 'M',false),
				new Customer(104,"Customer4",60, 'F',false),
				new Customer(105,"Customer5",70, 'M',false)
				);
		
		
		try {
			System.out.println(search(101, customers));
			System.out.println(search(102, customers));
			
			
			Customer customer1 = search(101,customers);
			Customer customer2 = search(102,customers);

			
			System.out.println("Customer Mobile Number : "+customer1.getMobile());
			System.out.println("Customer Mobile Number : "+customer2.getMobile());
			
			
		} 
		
		catch (CustomerNotFoundException e) {
			System.out.println("Customer Not Found Exception has occured and is handled within try-cathc block ");
			System.out.println(e.getMessage());
		}
		
		catch (CustomerNotActiveException e) {
			System.out.println("Customer Not Active Exception has occured and is handled within try-cathc block ");
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
	public static Customer search(Integer id, List<Customer> customers) throws CustomerNotFoundException, CustomerNotActiveException {
		
		Optional<Customer> customerO = customers.stream().filter((cust)->cust.getId().equals(id)).findAny();
		
		if(customerO.isEmpty()) throw new CustomerNotFoundException("Customer not found with id "+id);
		
		Customer customer = customerO.get();
		
		if(!customer.getActive()) throw new CustomerNotActiveException("Customer not active with id "+id);
		
		return customer;
		
	}

}
