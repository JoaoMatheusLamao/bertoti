package com.bertoti.apirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cor;

    public Produto(ProdutoRequestDTO p) {
        this.cor = p.cor();
        this.nome = p.nome();
        this.preco = p.preco();
        this.categoria = p.categoria();
        this.formaPagamento = p.formaPagamento();
    }
    public Produto(ProdutoDTO p) {
        this.cor = p.getCor();
        this.nome = p.getNome();
        this.preco = p.getPreco();
        this.id = p.getId();
        this.categoria = p.getCategoria();
        this.formaPagamento = p.getFormaPagamento();
    }

    private Double preco;

    @ManyToOne
    @JoinColumn(name="id_categoria", nullable=true)
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name="id_formapagamento", nullable=true)
    private FormaPagamento formaPagamento;
}
