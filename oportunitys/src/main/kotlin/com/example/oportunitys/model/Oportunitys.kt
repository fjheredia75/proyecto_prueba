package com.example.oportunitys.model

import jakarta.persistence.*

@Entity
@Table(name="oportunitys")
class Oportunitys {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var descripcion: String? = null
}