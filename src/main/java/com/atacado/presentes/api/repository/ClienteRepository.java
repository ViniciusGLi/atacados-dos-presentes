package com.atacado.presentes.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atacado.presentes.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
