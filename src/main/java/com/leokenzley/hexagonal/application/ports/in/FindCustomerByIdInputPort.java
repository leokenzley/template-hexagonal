package com.leokenzley.hexagonal.application.ports.in;

import com.leokenzley.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
