package com.example.categorys.repository

import com.example.categorys.model.Categorys
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategorysRepository: JpaRepository<Categorys, Long?> {
    fun findById(id: Long?): Categorys?
}