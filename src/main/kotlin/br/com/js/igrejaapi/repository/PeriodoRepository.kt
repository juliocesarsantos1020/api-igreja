package br.com.js.igrejaapi.repository

import br.com.js.igrejaapi.model.Periodo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PeriodoRepository : JpaRepository<Periodo, Int>