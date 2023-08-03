package com.example.customers.service

import com.example.customers.model.Customers
import com.example.customers.repository.CustomersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomersService {
    @Autowired
    lateinit var customersRepository: CustomersRepository
    fun list ():List<Customers>{
        return customersRepository.findAll()
    }
}