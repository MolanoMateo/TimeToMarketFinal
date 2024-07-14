package com.allucanlearn.proyectofinal.model;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class DetalleCurso {

    @Column(length = 100)
    String nombreInstructor;

    @Column(length = 255)
    String link;

    @Column(nullable = false)
    Integer duracion; // Duración en minutos

    
}
