package com.gusemmanuel23.muromensajes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
    // Aquí heredamos magia: save(), findAll(), delete(), etc.
}
