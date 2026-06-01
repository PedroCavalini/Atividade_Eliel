package com.bn.demo.services;

import com.bn.demo.models.ProdutoModel;
import com.bn.demo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // usada para marcar uma classe que contém a lógica de negócios da sua aplicação.
public class ProdutoService implements UserDetailsService {

    @Autowired // serve para automatizar a injeção de dependências
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> buscarTodosProdutos(){
        return  produtoRepository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produtoModel){
        return  produtoRepository.save(produtoModel);
    }

    public Optional<ProdutoModel> buscarProdutoId(Long id){
        return  produtoRepository.findById(id);
    }

    public ProdutoModel atualizarProduto(Long id, ProdutoModel produtoModel){
        ProdutoModel model = produtoRepository.findById(id).get();
        model.setPreco(produtoModel.getPreco());
        model.setEstoque(produtoModel.getEstoque());
        model.setNome(produtoModel.getNome());
        return produtoRepository.save(model);
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }

    @Override /* indica ao compilador que um método da classe filha foi criado para sobrescrever (reescrever)
                um método existente na classe pai ou implementar um método de uma interface. */
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return produtoRepository.findByLogin(username);
    }
}
