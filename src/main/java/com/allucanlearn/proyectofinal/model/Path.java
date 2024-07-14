package com.allucanlearn.proyectofinal.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@IdClass(PathId.class)
public class Path {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
