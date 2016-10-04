package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	
	private Map<String, Customer> customers;
	
	private static final CustomerService instance= new CustomerService();
	
	private  CustomerService(){
		customers=new HashMap<String, Customer>();		
	}
	
	public static CustomerService getInstance(){
		return instance;
	}
	public Customer login (String id, String pass){
		if(id!=null)
			return(customers.get(id.toLowerCase()));
		else
			return null;
		
	}
	public void addCustomer(Customer customer){
		customers.put(customer.getId(),customer);
		
	}
	public Customer findCustomer(String id,String pass){
		Customer customer=customers.get(id.toLowerCase());
		String customerId=customer.getId();
		String customerPW=customer.getPassword();
		if(id.equals(customerId) && pass.equals(customerPW))			
			return(customers.get(id.toLowerCase()));
		else
			return null;
	}
	
}
