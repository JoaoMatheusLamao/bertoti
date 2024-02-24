package com.bertoti.apirest.repository;

import com.bertoti.apirest.entities.Produto;
import com.bertoti.apirest.entities.ProdutoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
//@Query(nativeQuery = true, value = "UPDATE produto set nome = :newNome, cor = :newCor, preco = :newPreco where id = :id")
//    ProdutoDTO updateProdutoById(String newNome, String newCor, Double newPreco, Integer id);
}
