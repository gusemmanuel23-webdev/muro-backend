package com.gusemmanuel23.muromensajes;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mensajes")
@CrossOrigin(origins = "*") // Esto permite que el Frontend hable con el Backend
public class MensajeController {

    private final MensajeRepository repository;

    public MensajeController(MensajeRepository repository) {
        this.repository = repository;
    }

    @GetMapping // Para LEER mensajes
    public List<Mensaje> obtenerTodos() {
        return repository.findAll();
    }

    @PostMapping // Para GUARDAR mensajes
    public Mensaje crear(@RequestBody Mensaje mensaje) {
        return repository.save(mensaje);
    }
}