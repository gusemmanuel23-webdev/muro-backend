package com.gusemmanuel23.muromensajes;

import jakarta.persistence.*;

@Entity // Le dice a MySQL que esto es una tabla
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    // Constructores y Getters/Setters (IntelliJ te ayuda con Alt+Insert)
    public Mensaje() {}
    public Mensaje(String texto) { this.texto = texto; }

    public Long getId() { return id; }
    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }
}