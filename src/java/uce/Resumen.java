package uce;

import java.io.Serializable;


public class Resumen implements Serializable{
    private Integer id_calificacion;
    private String id_materia; //nombrfe materia
    private double nota_final;  //nota

    public Resumen() {
    }

    
    
    public Resumen(Integer codigo, String tipo_inspeccion, double valor) {
        this.id_calificacion = codigo;
        this.id_materia = tipo_inspeccion;
        this.nota_final = valor;
    }

    
    public Integer getCodigo() {
        return id_calificacion;
    }

    public void setCodigo(Integer codigo) {
        this.id_calificacion = codigo;
    }

    public String getTipo_inspeccion() {
        return id_materia;
    }

    public void setTipo_inspeccion(String tipo_inspeccion) {
        this.id_materia = tipo_inspeccion;
    }

    public double getValor() {
        return nota_final;
    }

    public void setValor(double valor) {
        this.nota_final = valor;
    }
    
    
}
