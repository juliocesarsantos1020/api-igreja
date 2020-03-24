package br.com.js.igrejaapi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "cultos")
data class Cultos(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Int,
    @Column(columnDefinition = "VARCHAR(180)")
    val descricao: String
)