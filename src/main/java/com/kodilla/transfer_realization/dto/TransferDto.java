package com.kodilla.transfer_realization.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferDto {
    private Long id;
    private String recipientAccount;
    private String senderAccount;
    private String title;
    private BigDecimal amount;
}
