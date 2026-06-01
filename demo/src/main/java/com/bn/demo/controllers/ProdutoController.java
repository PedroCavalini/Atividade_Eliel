package com.bn.demo.controllers;

import com.bn.demo.models.ProdutoModel;
import com.bn.demo.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController // marca uma classe para lidar com requisições HTTP e criar APIs RESTful.
@RequestMapping(path = {"/produtos", "/produtos/"}) // mapeia URLs para um método ou classe controladora.
public class ProdutoController {

    @Autowired // realiza a injeção de dependência automática
    private ProdutoService produtoService;

    @GetMapping // é utilizada para mapear solicitações HTTP GET para métodos específicos de um controlador.
        public ResponseEntity<List<ProdutoModel> > buscarTodosOsProdutos(){
          List<ProdutoModel> requeste = produtoService.buscarTodosProdutos();
        return ResponseEntity.ok().body(requeste);
    }

    @PostMapping // usada para enviar e criar novos dados no servidor, geralmente recebendo informações no corpo da requisição
    public ResponseEntity <ProdutoModel> criarProdutos(@RequestBody ProdutoModel produtoModel){
        ProdutoModel requeste = produtoService.criarProduto(produtoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}").buildAndExpand(produtoModel.getId())
                .toUri();
        return  ResponseEntity.created(uri).body(requeste);
    }

    @DeleteMapping("/{id}") // mapeia requisições HTTP DELETE para remover recurses
    public ResponseEntity<?> deletarProdutos(@PathVariable Long id){
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}") // usada para mapear solicitações HTTP GET que buscam um recurso específico pelo seu identificador único (ID).
    public Optional<ProdutoModel> buscarProdutoPorId(@PathVariable Long id){
        return  produtoService.buscarProdutoId(id);
    }

    @PutMapping("/{id}") /* usado para mapear requisições HTTP PUT para um método específico de um Controller,
                          sendo o padrão para atualizar recursos existentes.*/
    public ResponseEntity <ProdutoModel> atualizarProdutos(@PathVariable Long id, @RequestBody ProdutoModel ProdutoModel){
        ProdutoModel requeste = produtoService.atualizarProduto(id, ProdutoModel);
        return  ResponseEntity.ok().body(requeste);

    }








}
