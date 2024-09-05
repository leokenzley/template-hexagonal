package com.leokenzley.hexagonal.adapters.in.controller.response;

import com.leokenzley.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {
    private String id;
    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
