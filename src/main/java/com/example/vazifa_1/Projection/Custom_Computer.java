package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Printerr;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Printerr.class)
public interface Custom_Computer {
    Integer getId();
    String getName();
    int getParent_catagory_id();
    boolean getActive();
}
