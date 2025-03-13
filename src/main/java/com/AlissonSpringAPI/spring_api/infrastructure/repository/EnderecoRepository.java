package com.AlissonSpringAPI.spring_api.infrastructure.repository;

import com.AlissonSpringAPI.spring_api.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
