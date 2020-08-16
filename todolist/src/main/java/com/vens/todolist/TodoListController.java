package com.vens.todolist;

import com.vens.todolist.entity.ActivityEntity;
import com.vens.todolist.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoListController {
    @Autowired
    ActivityService activityService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping(value = "/activity", consumes = "application/json", produces = "application/json")
    public String saveActivity(@RequestBody String activity) {
        ActivityEntity a = new ActivityEntity();
         a.setDescription(activity);
         activityService.saveActivity(a);
        return "Done";
    }

    @RequestMapping
    public List<ActivityEntity> activities() {
        return activityService.getAllActivities();
    }
}
