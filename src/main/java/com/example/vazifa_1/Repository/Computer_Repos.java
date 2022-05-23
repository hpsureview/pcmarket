package com.example.vazifa_1.Repository;

import com.example.vazifa_1.entity.Igrovoy_Kreslo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment_center" , collectionResourceRel = "List", excerptProjection = Igrovoy_Kreslo.class)

public interface Computer_Repos extends JpaRepository<Igrovoy_Kreslo,Integer> {
}
