package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {
Customer getCustomer(Customer customer);
List<Customer> getAllCustomer();
}
