package org.example.mvc_qlkh.service;

import org.example.mvc_qlkh.model.Customer;
import java.util.*;
public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(int id);
    void update(int id, Customer customer);
    void remove(int id);
}
