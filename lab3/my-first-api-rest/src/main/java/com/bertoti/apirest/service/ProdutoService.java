package com.bertoti.apirest.service;

import com.bertoti.apirest.entities.Produto;
import com.bertoti.apirest.entities.ProdutoDTO;
import com.bertoti.apirest.entities.ProdutoRequestDTO;
import com.bertoti.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produto;

    @Transactional(readOnly = true)
    public List<ProdutoDTO> findAll(){
        List<Produto> p = this.produto.findAll();
        List<ProdutoDTO> transfer = p.stream().map(ProdutoDTO::new).toList();
        return transfer;
    }
    @Transactional(readOnly = true)
    public ProdutoDTO findById(Integer id){
        Produto p = this.produto.findById(id).get();
       return new ProdutoDTO(p);
    }

    @Transactional(readOnly = false)
    public void saveAll(ProdutoRequestDTO p){
        Produto data = new Produto(p);
        this.produto.save(data);
    }

    @Transactional(readOnly = false)
    public ProdutoDTO updateProduto(String newNome, String newCor, Double newPreco, Integer id) throws Exception{

        Produto curret = produto.findById(id).get();

        if (curret == null) {
            return null;
        }

        curret.setCor(newCor);
        curret.setNome(newNome);
        curret.setPreco(newPreco);

        produto.save(curret);

        curret = produto.findById(id).get();

        return new ProdutoDTO(curret);
    }

    @Transactional(readOnly = false)
    public void deleteById(Integer id){
        this.produto.deleteById(id);
    }
}
