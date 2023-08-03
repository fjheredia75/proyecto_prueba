package com.example.activities.service

import com.example.activities.model.Activities
import com.example.activities.repository.ActivitiesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActivitiesService {
    @Autowired
    lateinit var activitiesRepository: ActivitiesRepository
    fun list ():List<Activities>{
        return activitiesRepository.findAll()
    }
}