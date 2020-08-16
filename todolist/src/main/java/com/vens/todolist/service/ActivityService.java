package com.vens.todolist.service;

import com.vens.todolist.entity.ActivityEntity;
import com.vens.todolist.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
    @Autowired
    ActivityRepository activityRepository;

    public ActivityEntity saveActivity(ActivityEntity activity) {
       return  activityRepository.save(activity);
    }

    public List<ActivityEntity> getAllActivities(){
        return activityRepository.findAll();
    }
}
