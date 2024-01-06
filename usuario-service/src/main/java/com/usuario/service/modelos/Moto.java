package com.usuario.service.modelos;

public class Moto {

    private String marca;
    private String modelo;
    private int usuarioId;  // Recien se agrega usuarioId con set y get - FeignClient

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Moto() {
        super();
    }

}
