package br.unigran.view.cadastro;

import br.unigran.controllers.FuncionarioDto;
import br.unigran.entidades.Funcionario;

public class EstadoAplicacao {
    public static EstadoAplicacao instancia = new EstadoAplicacao();
    FuncionarioDto logado;
    private EstadoAplicacao() {
    }
    public FuncionarioDto getLogado() {
        return logado;
    }
    public EstadoAplicacao setLogado(FuncionarioDto logado) {
        this.logado = logado;
        return this;
    }
}
