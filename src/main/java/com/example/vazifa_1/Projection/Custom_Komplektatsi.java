package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Periferiya;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Periferiya.class)
public interface Custom_Komplektatsi {
    Integer getId();
    Date getDate();
    int getWherehouse_id();
    int getSupplier_id();
    int getCurrency_id();
    int getFacture_number();
    int getCode();
}
