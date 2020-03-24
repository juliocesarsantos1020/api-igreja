package br.com.js.igrejaapi.repository

import br.com.js.igrejaapi.model.Contatos
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContatosRepository : JpaRepository<Contatos, Int>