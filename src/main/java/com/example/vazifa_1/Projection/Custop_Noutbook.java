package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Computerr;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Computerr.class)
public interface Custop_Noutbook {
     Integer getId();

     String getName();

     Integer getSize();

     String getContent_type();
}
