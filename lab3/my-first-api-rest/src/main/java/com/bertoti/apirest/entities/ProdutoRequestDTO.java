package com.bertoti.apirest.entities;

public record ProdutoRequestDTO(String nome, String cor, Double preco, Categoria categoria, FormaPagamento formaPagamento) {
}
