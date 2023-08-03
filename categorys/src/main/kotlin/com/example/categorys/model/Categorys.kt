package com.example.categorys.model

import jakarta.persistence.*


@Entity
@Table(name="categorys")
class Categorys {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var descripcion: String? = null
}