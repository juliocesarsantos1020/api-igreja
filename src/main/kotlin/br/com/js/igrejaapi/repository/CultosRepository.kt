package br.com.js.igrejaapi.repository

import br.com.js.igrejaapi.model.Cultos
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CultosRepository : JpaRepository<Cultos, Int>