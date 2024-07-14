package com.allucanlearn.proyectofinal.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Plataforma {
    
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String token;
    
    public List<Curso> getCourses() {
        // Logic to get courses
        return new ArrayList<>();
    }
    
    public List<Certificado> getCertificate() {
        // Logic to get certificates
        return new ArrayList<>();
    }
}
