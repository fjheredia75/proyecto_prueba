package com.example.customers.model

import jakarta.persistence.*


@Entity
@Table(name="customers")
class Customers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombre: String? = null
    var apellido: String? = null
}