/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.controllers;

import br.unigran.entidades.Funcionario;
/**
 *
 * @author User
 */
public class FuncionarioDto {
    public String nomeFuncionario;
    public String cpf;
    public String dataNasc;
    public String endereco;
    public String sexo;
    public String telefone;
    public String email;
    public String setDataContratacao;
    public Float salario;
    public String funcao;

    public Funcionario builder() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeFuncionario(nomeFuncionario);
        funcionario.setCpf(cpf);
        funcionario.setDataNasc(dataNasc);
        funcionario.setSexo(sexo);
        funcionario.setTelefone(telefone);
        funcionario.setEmail(email);
        funcionario.setDataContratacao(setDataContratacao);
        funcionario.setSalario(salario);
        funcionario.setFuncao(funcao);
        return funcionario;
    }
}