package br.unigran.controllers;

import br.unigran.dao.ProdutoDao;
import br.unigran.implement.ProdutoImpl;
import java.util.List;

public class ProdutoController {

    public static final ProdutoController INSTANCE = new ProdutoController();

    private ProdutoController(){
    }

    ProdutoDao dao = new ProdutoImpl();

    public void salvar(ProdutoDto prod) throws Exception {
        dao.salvar(prod.builder());
    }

    public List<ProdutoDto> listar() throws Exception {
        return dao.listar().stream().map(ProdutoDto::new).toList();
    }

    public ProdutoDto buscar(long id) throws Exception {
        return new ProdutoDto(dao.listarId(id));
    }

    public void alterar(ProdutoDto funcionarioDTO) throws Exception {
         dao.atualiza(funcionarioDTO.builder());
    }

    public List<ProdutoDto> listarNome(String nome) throws Exception {
        return dao.listarNome(nome).stream().map(ProdutoDto::new).toList();
    }

    public List<ProdutoDto> listarOrdenado(boolean asc) {
        return dao.listarOrd(asc).stream().map(ProdutoDto::new).toList();
    }
    public void remover(ProdutoDto produtoDTO){
        dao.remove(produtoDTO.builder());
    }
}
