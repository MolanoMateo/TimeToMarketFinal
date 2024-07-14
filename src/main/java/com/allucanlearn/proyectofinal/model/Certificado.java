package com.allucanlearn.proyectofinal.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Certificado {
    
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String titulo;
    
    @ManyToOne
    @JoinColumn(name = "curso_id")
    @DescriptionsList
    private Curso curso;
    
    private String fecha;
    
    private String nombre;
    
}
