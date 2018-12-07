package com.upc.pichanga.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpartido;
    private Long idusuario;
    private Long idcancha;
    private String descripcion;

    public Long getIdpartido() {
        return idpartido;
    }

    public void setIdpartido(Long idpartido) {
        this.idpartido = idpartido;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public Long getIdcancha() {
        return idcancha;
    }

    public void setIdcancha(Long idcancha) {
        this.idcancha = idcancha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
