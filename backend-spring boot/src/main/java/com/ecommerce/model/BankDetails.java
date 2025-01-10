package com.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BankDetails {

    private String accountNumber;
    private String accountHolderName;
    private String ifscCode;

}
