package br.com.js.igrejaapi.model

import br.com.js.igrejaapi.model.embeddable.Endereco
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "visitantes")
data class Visitantes(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Int,
    @Column(name = "data_visita", columnDefinition = "DATETIME")
    val dataVisita: LocalDateTime,
    @Column(columnDefinition = "VARCHAR(200)")
    val nome: String,
    @Column(name = "data_nascimento", columnDefinition = "DATE")
    val dataNascimento: LocalDate,
    @Column(name = "is_receber_visita")
    val isReceberVisita: Boolean,
    @ManyToOne
    @JoinColumn(name = "id_cultos")
    val cultos: Cultos,
    @ManyToOne
    @JoinColumn(name = "id_estado_civil")
    val estadoCivil: EstadoCivil,
    @ManyToOne
    @JoinColumn(name = "id_frequencia")
    val frequencia: Frequencia,
    @ManyToOne
    @JoinColumn(name = "id_comunicacao")
    val comunicacao: Comunicacao,
    @ManyToOne
    @JoinColumn(name = "id_periodo")
    val periodo: Periodo,
    @Embedded
    val endereco: Endereco,
    @OneToMany(mappedBy = "visitante")
    val contatos: List<Contatos>
)