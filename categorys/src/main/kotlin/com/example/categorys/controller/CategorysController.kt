package com.example.categorys.controller

import com.example.categorys.model.Categorys
import com.example.categorys.service.CategorysService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/categorys")
class CategorysController {
    @Autowired
    lateinit var categorysService: CategorysService
    @GetMapping
    fun list ():List<Categorys>{
        return categorysService.list()
    }
}
