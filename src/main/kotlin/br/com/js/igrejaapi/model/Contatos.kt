package br.com.js.igrejaapi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "contatos")
data class Contatos(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Int,
    @Column(columnDefinition = "VARCHAR(180)")
    val valor: String,
    @ManyToOne
    @JoinColumn(name = "id_tipo_contato")
    val tipoContato: TipoContato,
    @ManyToOne
    @JoinColumn(name = "id_visitante")
    val visitante: Visitantes
)