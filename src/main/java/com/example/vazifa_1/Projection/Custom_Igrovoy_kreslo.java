package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Komplektatsi;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Komplektatsi.class)
public interface Custom_Igrovoy_kreslo {
    Integer getId();
    String getName();
    String getPhone_number();
}
