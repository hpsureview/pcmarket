package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Komplektatsi;
import com.example.vazifa_1.entity.Periferiya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input" , collectionResourceRel = "List", excerptProjection = Custom_Komplektatsi.class)

public interface Noutbook_Repos extends JpaRepository<Periferiya,Integer> {
}
