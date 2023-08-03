package com.example.oportunitys.repository

import com.example.oportunitys.model.Oportunitys
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OportunitysRepository: JpaRepository<Oportunitys, Long?> {
    fun findById(id: Long?): Oportunitys?
}