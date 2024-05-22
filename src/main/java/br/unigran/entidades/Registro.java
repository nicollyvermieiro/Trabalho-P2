/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.entidades;

/**
 *
 * @author User
 */
public class Registro {
    private Integer id;
    private String dtAcssEntrada;
    private String dtAcssSaida;
    private String dtSaidaProduto;
    private Login login;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDtAcssEntrada() {
        return dtAcssEntrada;
    }

    public void setDtAcssEntrada(String dtAcssEntrada) {
        this.dtAcssEntrada = dtAcssEntrada;
    }

    public String getDtAcssSaida() {
        return dtAcssSaida;
    }

    public void setDtAcssSaida(String dtAcssSaida) {
        this.dtAcssSaida = dtAcssSaida;
    }

    public String getDtSaidaProduto() {
        return dtSaidaProduto;
    }

    public void setDtSaidaProduto(String dtSaidaProduto) {
        this.dtSaidaProduto = dtSaidaProduto;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    
}
