package com.allucanlearn.proyectofinal.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class User {
    
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Embedded
    private DetalleUser data;
    
}

