package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Periferiya;
import com.example.vazifa_1.entity.Monoblock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurment" , collectionResourceRel = "List", excerptProjection = Custom_Periferiya.class)

public interface Printer_Repos extends JpaRepository<Monoblock,Integer> {
}
