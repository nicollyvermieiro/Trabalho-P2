package br.unigran.controllers;

import br.unigran.entidades.Cargo;
import br.unigran.entidades.Endereco;
import br.unigran.entidades.Funcionario;
import javax.swing.JTextField;

public class FuncionarioDto {

    private Long id;
    private String nomeFuncionario;
    private String cpf;
    private String dataNasc;
    private Endereco endereco;
    private String sexo;
    private String telefone;
    private String email;
    private String dataAdmissao;
    private Float salario;
    private Cargo cargo;
    private String login;
    private String senha;

    public Funcionario builder() {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(id);
        funcionario.setNome(nomeFuncionario);
        funcionario.setCpf(cpf);
        funcionario.setDataNasc(dataNasc);
        funcionario.setEndereco(endereco);
        funcionario.setSexo(sexo);
        funcionario.setTelefone(telefone);
        funcionario.setEmail(email);
        funcionario.setDataAdmissao(dataAdmissao);
        funcionario.setSalario(salario);
        funcionario.setCargo(cargo);
        funcionario.setLogin(login);
        funcionario.setSenha(senha);
        return funcionario;
    }

    public FuncionarioDto (Funcionario funcionario){
        this.id = funcionario.getId();
        this.nomeFuncionario = funcionario.getNome();
        this.cpf = funcionario.getCpf();
        this.dataNasc = funcionario.getDataNasc();
        this.endereco = funcionario.getEndereco();
        this.sexo = funcionario.getSexo();
        this.telefone = funcionario.getTelefone();
        this.email = funcionario.getEmail();
        this.dataAdmissao = funcionario.getDataAdmissao();
        this.salario = funcionario.getSalario();
        this.cargo = funcionario.getCargo();
        this.login = funcionario.getLogin();
        this.senha = funcionario.getSenha();
    }

    public FuncionarioDto() {
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public FuncionarioDto setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public FuncionarioDto setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public FuncionarioDto setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }    

    public String getSexo() {
        return sexo;
    }

    public FuncionarioDto setSexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public FuncionarioDto setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public FuncionarioDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public FuncionarioDto setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
        return this;
    }

    public float getSalario() {
        return salario;
    }

    public FuncionarioDto setSalario(float salario) {
        this.salario = salario;
        return this;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public FuncionarioDto setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public FuncionarioDto setSenha(String senha) {
        this.senha = senha;
        return this;
    }
}
