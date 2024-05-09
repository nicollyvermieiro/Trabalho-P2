/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author User
 */
public class Validade {
    private Integer id;
    private String dtFab;
    private String dtVenc;
    private Entrada entrada;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDtFab() {
        return dtFab;
    }

    public void setDtFab(String dtFab) {
        this.dtFab = dtFab;
    }

    public String getDtVenc() {
        return dtVenc;
    }

    public void setDtVenc(String dtVenc) {
        this.dtVenc = dtVenc;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
    
}
