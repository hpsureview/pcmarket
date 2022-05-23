package com.example.vazifa_1.Repository;

import com.example.vazifa_1.entity.Computerr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment" , collectionResourceRel = "List", excerptProjection = Computerr.class)

public interface Igrovoy_kreslo_Repos extends JpaRepository<Computerr,Integer> {
}
