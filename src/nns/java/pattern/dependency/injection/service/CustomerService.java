package nns.java.pattern.dependency.injection.service;


import java.util.List;
import java.util.Optional;

import nns.java.pattern.dependency.injection.dao.CustomerDao;
import nns.java.pattern.dependency.injection.entity.Customer;




public class CustomerService {

	
    private final CustomerDao customerDao;

 
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Optional<Customer> findById(int id) {
        return customerDao.findById(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}