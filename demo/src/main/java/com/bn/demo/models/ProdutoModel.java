package com.bn.demo.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity // marca uma classe Java como uma entidade de banco de dados no padrão JPA
@Table(name = "TB_PRODUTO") // mapea uma classe Java para uma tabela específica no banco de dados.
public class ProdutoModel {

    @Id // mapeia o atributo de uma classe para a chave primária do banco de dados.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // avisa o Java para delegar a geração do ID ao banco de dados.
    private Long id;
    private String nome;
    @Column(name = "preco_do_produto") // mapeia um atributo da classe Java para uma coluna específica no banco de dados.
    private BigDecimal preco;
    @Column(name = "quant_estoque") // mapeia um atributo da classe Java para uma coluna específica no banco de dados.
    private Integer estoque;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPreco() { return preco; }

    public void setPreco(BigDecimal preco) { this.preco = preco; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Integer getEstoque() { return estoque; }

    public void setEstoque(Integer estoque) { this.estoque = estoque; }
}
