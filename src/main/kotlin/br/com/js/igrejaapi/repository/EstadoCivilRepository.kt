package br.com.js.igrejaapi.repository

import br.com.js.igrejaapi.model.EstadoCivil
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EstadoCivilRepository : JpaRepository<EstadoCivil, Int>