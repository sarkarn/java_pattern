package nns.java.pattern.dependency.injection.dao.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import nns.java.pattern.dependency.injection.dao.CustomerDao;
import nns.java.pattern.dependency.injection.entity.Customer;



public class SimpleCustomerDao implements CustomerDao {

    private Map<Integer, Customer> customers = new HashMap<>();

    public SimpleCustomerDao(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}