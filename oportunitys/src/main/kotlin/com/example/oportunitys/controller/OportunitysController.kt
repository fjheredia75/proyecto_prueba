package com.example.oportunitys.controller

import com.example.oportunitys.model.Oportunitys
import com.example.oportunitys.service.OportunitysService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/oportunitys")
class OportunitysController {
    @Autowired
    lateinit var oportunitysService: OportunitysService
    @GetMapping
    fun list ():List<Oportunitys>{
        return oportunitysService.list()
    }
}