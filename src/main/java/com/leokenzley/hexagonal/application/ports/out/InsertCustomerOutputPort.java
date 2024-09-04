package com.leokenzley.hexagonal.application.ports.out;

import com.leokenzley.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
