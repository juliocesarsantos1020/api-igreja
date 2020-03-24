package br.com.js.igrejaapi.repository

import br.com.js.igrejaapi.model.TipoContato
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TipoContatoRepository : JpaRepository<TipoContato, Int>