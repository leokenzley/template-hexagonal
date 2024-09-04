package com.leokenzley.hexagonal.adapters.out;

import com.leokenzley.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.leokenzley.hexagonal.adapters.out.client.mapper.AddressResonseMapper;
import com.leokenzley.hexagonal.application.core.domain.Address;
import com.leokenzley.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {
    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResonseMapper addressResonseMapper;
    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResonseMapper.toAddress(addressResponse);
    }
}
