/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.entidades;

import javax.persistence.*;

@Entity
public class Saida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motivo;
    private String dtSaida;

    @ManyToOne
    @JoinColumn(name = "estoque_id")
    private Estoque estoque;

    public Saida(String motivoSaida, String dataSaida) {
        this.motivo = motivoSaida;
        this.dtSaida = dataSaida;
    }

    public Saida() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    public void Login(){

    }

    public void efetuarSaida(){

    }

    public void alterar(){

    }
}
