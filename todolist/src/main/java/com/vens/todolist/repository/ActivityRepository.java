package com.vens.todolist.repository;

import com.vens.todolist.entity.ActivityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends CrudRepository<ActivityEntity, Long> {

    List<ActivityEntity> findAll();
    ActivityEntity save(ActivityEntity a);
}
