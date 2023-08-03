package com.example.customers.repository

import com.example.customers.model.Customers
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomersRepository: JpaRepository<Customers, Long?> {
    fun findById(id: Long?): Customers?
}