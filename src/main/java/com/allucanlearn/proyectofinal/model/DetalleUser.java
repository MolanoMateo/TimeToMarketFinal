package com.allucanlearn.proyectofinal.model;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class DetalleUser {
    
    @Column(nullable = false)
    private String mail;
    
    @Column(nullable = false)
    private String password;
    
    @Column(nullable = false)
    private String lastName;
    
    @Column(nullable = false)
    private String name;
   
    
    @ElementCollection
    private List<Certificado> certificados = new ArrayList<>();
    
}

