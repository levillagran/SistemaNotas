package uce;

import java.io.Serializable;

public class entrar implements Serializable {

    int id;
    private String usuario;
    private String clave;  //nota
    private int nivel_acceso;

    public entrar() {
    }

    public entrar(Integer id, String usuario, String clave, int nivel_acceso) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.nivel_acceso= nivel_acceso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getNivel_acceso() {
        return nivel_acceso;
    }

    public void setNivel_acceso(int nivel_acceso) {
        this.nivel_acceso = nivel_acceso;
    }

}
