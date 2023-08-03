package com.example.activities.controller

import com.example.activities.model.Activities
import com.example.activities.service.ActivitiesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/activities")
class ActivitiesController {
    @Autowired
    lateinit var activitiesService: ActivitiesService
    @GetMapping
    fun list ():List<Activities>{
        return activitiesService.list()
    }
}