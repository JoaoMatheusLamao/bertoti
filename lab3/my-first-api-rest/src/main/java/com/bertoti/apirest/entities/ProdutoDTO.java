package com.bertoti.apirest.entities;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProdutoDTO {
        private Integer id;
        private String nome;
        private String cor;
        private Double preco;
        private Categoria categoria;
        private FormaPagamento formaPagamento;

        public ProdutoDTO(Produto p) {
                BeanUtils.copyProperties(p, this);
        }
        public ProdutoDTO(ProdutoRequestDTO p) {
                BeanUtils.copyProperties(p, this);
        }
}
