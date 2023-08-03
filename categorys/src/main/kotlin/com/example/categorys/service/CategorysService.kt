package com.example.categorys.service

import com.example.categorys.model.Categorys
import com.example.categorys.repository.CategorysRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategorysService {
    @Autowired
    lateinit var categorysRepository: CategorysRepository
    fun list ():List<Categorys>{
        return categorysRepository.findAll()
    }
}