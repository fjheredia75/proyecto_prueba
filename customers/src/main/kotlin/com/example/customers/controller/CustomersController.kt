package com.example.customers.controller

import com.example.customers.model.Customers
import com.example.customers.service.CustomersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/customers")
class CustomersController {
    @Autowired
    lateinit var customersService: CustomersService
    @GetMapping
    fun list ():List<Customers>{
        return customersService.list()
    }
}