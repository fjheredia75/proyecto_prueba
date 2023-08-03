package com.example.activities.repository

import com.example.activities.model.Activities
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ActivitiesRepository: JpaRepository<Activities, Long?> {
    fun findById(id: Long?): Activities?
}