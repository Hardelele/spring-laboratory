package org.perfectstorms.demo.repository;

import org.perfectstorms.demo.entities.TestEntity;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestEntity, Integer> {
    
}
