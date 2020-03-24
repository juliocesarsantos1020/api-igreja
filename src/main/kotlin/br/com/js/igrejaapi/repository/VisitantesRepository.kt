package br.com.js.igrejaapi.repository

import br.com.js.igrejaapi.model.Visitantes
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VisitantesRepository : JpaRepository<Visitantes, Int>