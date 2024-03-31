package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
