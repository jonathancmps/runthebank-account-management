package com.runthebank.account.management.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CustomerDTO {

    @NotBlank(message = "The document number is mandatory.")
    private String documentNumber;

    @NotBlank(message = "The name is mandatory.")
    private String name;

    @NotBlank(message = "The address is mandatory.")
    private String address;

    @NotBlank(message = "The password is mandatory.")
    @Size(min = 6, max = 20, message = "password must required between 6 to 20 characters.")
    private String password;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
