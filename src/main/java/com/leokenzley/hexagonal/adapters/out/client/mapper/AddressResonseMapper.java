package com.leokenzley.hexagonal.adapters.out.client.mapper;

import com.leokenzley.hexagonal.adapters.out.client.response.AddressResponse;
import com.leokenzley.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResonseMapper {
    Address toAddress(AddressResponse addressResponse);
}
