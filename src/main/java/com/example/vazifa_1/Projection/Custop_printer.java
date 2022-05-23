package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Igrovoy_Kreslo;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Igrovoy_Kreslo.class)
public interface Custop_printer {
    Integer getId();
    int getByte1();
    int getAttachment_id();

}
