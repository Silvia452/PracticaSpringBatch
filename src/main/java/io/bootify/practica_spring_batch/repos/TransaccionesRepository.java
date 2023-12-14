package io.bootify.practica_spring_batch.repos;

import io.bootify.practica_spring_batch.domain.Transacciones;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransaccionesRepository extends JpaRepository<Transacciones, Long> {
}
