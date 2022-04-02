package com.metel.codex.trading.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

@Data
public class Items {
    private String itemCode;
    private String ymd;
    private String itemName;
    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal close;
    private BigInteger vol;
    private String created;
    private String updated;

}