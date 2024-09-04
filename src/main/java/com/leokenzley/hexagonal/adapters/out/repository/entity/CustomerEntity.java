package com.leokenzley.hexagonal.adapters.out.repository.entity;

import com.leokenzley.hexagonal.application.core.domain.Address;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "customers")
public class CustomerEntity {
    @Id
    private String id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;
}
