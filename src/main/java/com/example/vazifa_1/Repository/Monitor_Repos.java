package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Computer;
import com.example.vazifa_1.entity.Printerr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cateory" , collectionResourceRel = "List", excerptProjection = Custom_Computer.class)

public interface Monitor_Repos extends JpaRepository<Printerr,Integer> {
}
