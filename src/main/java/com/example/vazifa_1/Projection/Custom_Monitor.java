package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Monitor;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Monitor.class)
public interface Custom_Monitor {
    Integer getId();
    int getProduct_id();
    int getAmount();
    int getPrice();
    Date getExpire_date();
    int getInput_id();
}
