package br.com.js.igrejaapi.repository

import br.com.js.igrejaapi.model.Comunicacao
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ComunicacaoRepository : JpaRepository<Comunicacao, Int>