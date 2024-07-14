package com.allucanlearn.proyectofinal.model;

import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Curso {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    String oid;

    @Column(length = 100, nullable = false)
    @Required
    String titulo;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    @DescriptionsList
    Categoria categoria;

    @ManyToMany
    @ListProperties("nombre")
    @JoinTable(
        name = "curso_tag",
        joinColumns = @JoinColumn(name = "curso_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    List<Tag> tags = new ArrayList<>();

    @Embedded
    DetalleCurso detalleCurso;

    // Constructor por defecto
    public Curso() {}

    // Constructor con parámetros
    public Curso(String titulo, Categoria categoria, DetalleCurso detalleCurso) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.detalleCurso = detalleCurso;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
