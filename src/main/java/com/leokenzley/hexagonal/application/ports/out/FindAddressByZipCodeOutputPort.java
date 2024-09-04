package com.leokenzley.hexagonal.application.ports.out;

import com.leokenzley.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
