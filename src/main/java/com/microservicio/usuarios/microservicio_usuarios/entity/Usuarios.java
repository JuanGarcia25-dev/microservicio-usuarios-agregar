/*****************************************************************************
 * @Author                : adolnb<loro.lorenzonunez@gmail.com>              *
 * @CreatedDate           : 2025-11-07 18:37:21                              *
 * @LastEditors           : adolnb<loro.lorenzonunez@gmail.com>              *
 * @LastEditDate          : 2025-11-07 18:37:21                              *
 * @FilePath              : Usuarios.java                                    *
 * @CopyRight             : © 2025 Adonai LN - B0MB0                         *
 ****************************************************************************/

package com.microservicio.usuarios.microservicio_usuarios.entity;

import java.sql.Array;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "t_usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matricula", nullable = true, unique = true)
    private String matricula;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    
    @Column(name = "rol", nullable = false)
    private Array rol;
    
    @Column(name = "estatus", nullable = false)
    private Boolean estatus;
}
