package br.com.js.igrejaapi.model.embeddable

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class Endereco(
    @Column(columnDefinition = "LONGTEXT")
    val endereco: String,
    @Column(columnDefinition = "VARCHAR(10)")
    val numero: String,
    @Column(columnDefinition = "VARCHAR(170)")
    val bairro: String,
    @Column(columnDefinition = "VARCHAR(170)")
    val cidade: String,
    @Column(columnDefinition = "CHAR(3)")
    val estado: String,
    val cep: Integer,
    @Column(columnDefinition = "LONGTEXT")
    val complemento: String
)