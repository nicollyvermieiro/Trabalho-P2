/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author User
 */
public class Saida {
    private Integer id;
    private String dtSaida;
    private String motivo;
    private Estoque estoque;
    private CodBarras codBarras;
    private NotaFiscal notaF;
    private Registro registro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public CodBarras getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(CodBarras codBarras) {
        this.codBarras = codBarras;
    }

    public NotaFiscal getNotaF() {
        return notaF;
    }

    public void setNotaF(NotaFiscal notaF) {
        this.notaF = notaF;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }
    
}
