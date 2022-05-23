package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Monoblock;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Monoblock.class)
public interface Custom_Periferiya {
    Integer getId();
    String getName();
    boolean getActive();
}
