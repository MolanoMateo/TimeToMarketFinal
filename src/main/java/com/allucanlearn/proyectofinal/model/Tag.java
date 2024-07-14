package com.allucanlearn.proyectofinal.model;

import java.util.*;

/*import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Tag {

	@Id
	@Hidden
	@Column(length=6)
	int id;
	
	@Required
	@Column(length=6)
	String nombre;  
	
}*/

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Tag {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    String oid;

    @Column(length = 50, nullable = false)
    @Required
    String nombre;

    @ManyToMany(mappedBy = "tags")
    List<Curso> cursos = new ArrayList<>();

    
}

