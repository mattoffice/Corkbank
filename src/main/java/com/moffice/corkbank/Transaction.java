package com.moffice.corkbank;

import lombok.Data;

@Data
public class Transaction {
    private String type;
    private long accountNumber;
    private String currency;
    private float amount;
    private String merchantName;
    private String merchantLogo;
}
