package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Monitor;
import com.example.vazifa_1.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input" , collectionResourceRel = "List", excerptProjection = Custom_Monitor.class)

public interface Monoblock_Repos extends JpaRepository<Monitor,Integer> {
}
