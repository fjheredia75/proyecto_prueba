package com.example.oportunitys.service

import com.example.oportunitys.model.Oportunitys
import com.example.oportunitys.repository.OportunitysRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class OportunitysService {
    @Autowired
    lateinit var oportunitysRepository: OportunitysRepository
    fun list ():List<Oportunitys>{
        return oportunitysRepository.findAll()
    }
}