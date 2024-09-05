package com.leokenzley.hexagonal.application.ports.out;

import com.leokenzley.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
