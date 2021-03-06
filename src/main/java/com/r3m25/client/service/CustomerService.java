package com.r3m25.client.service;

import com.r3m25.client.adapter.CustomerAdapter;
import com.r3m25.client.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerAdapter customerAdapter;

    public Customer findCustomerById(String customerId) {
        return customerAdapter.getCustomerById(customerId);
    }

    public List<Customer> getCustomers() {
        return customerAdapter.getCustomers();
    }
}
