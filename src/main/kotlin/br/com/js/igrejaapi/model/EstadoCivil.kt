package br.com.js.igrejaapi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "estado_civil")
data class EstadoCivil(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Int,
    @Column(columnDefinition = "VARCHAR(60)")
    val descricao: String
)