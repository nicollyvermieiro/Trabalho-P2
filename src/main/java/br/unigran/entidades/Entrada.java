/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.entidades;

/**
 *
 * @author User
 */
public class Entrada {
    private Integer id;
    private String dataEntrada;
    private Integer secao;
    private CodBarras codBarras;
    private Estoque estoque;
    private Login login;
    private NotaFiscal notaFiscal;
    private Registro registro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Integer getSecao() {
        return secao;
    }

    public void setSecao(Integer secao) {
        this.secao = secao;
    }

    public CodBarras getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(CodBarras codBarras) {
        this.codBarras = codBarras;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }
    
    public void Login(){

    }

    public void efetuarEntrada(){

    }

    public void alterar(){

    }
    
}
