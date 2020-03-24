package br.com.js.igrejaapi.repository

import br.com.js.igrejaapi.model.Frequencia
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FrequenciaRepository : JpaRepository<Frequencia, Int>