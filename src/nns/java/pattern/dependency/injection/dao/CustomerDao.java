package nns.java.pattern.dependency.injection.dao;


import java.util.List;
import java.util.Optional;

import nns.java.pattern.dependency.injection.entity.Customer;



public interface CustomerDao {

    Optional<Customer> findById(int id);

    List<Customer> findAll();

}