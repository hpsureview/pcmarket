package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Noutbook;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Noutbook.class)
public interface Custom_Monoblock {
    Integer getId();
    String getName();
    Boolean getActive();

}
