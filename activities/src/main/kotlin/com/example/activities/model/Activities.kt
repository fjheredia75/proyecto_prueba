package com.example.activities.model

import jakarta.persistence.*


@Entity
@Table(name="activities")
class Activities {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var descripcion: String? = null
}