package org.perfectstorms.demo.repository;

import org.perfectstorms.demo.entities.TestEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<TestEntity, Integer> {

    @Query (value = "SELECT * FROM test mytable WHERE mytable.id = :id ", nativeQuery = true)
    TestEntity getOneById(@Param("id") Long id);

}
