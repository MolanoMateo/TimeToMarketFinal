package com.allucanlearn.proyectofinal.model;

import java.io.*;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
public class PathId implements Serializable {
    private int curso;
    private int user;
}
