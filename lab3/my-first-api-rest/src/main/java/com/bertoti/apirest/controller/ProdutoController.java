package com.bertoti.apirest.controller;

import com.bertoti.apirest.entities.ProductUpdateDTO;
import com.bertoti.apirest.entities.Produto;
import com.bertoti.apirest.entities.ProdutoDTO;
import com.bertoti.apirest.entities.ProdutoRequestDTO;
import com.bertoti.apirest.service.ProdutoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService p;

    @GetMapping
    public List<ProdutoDTO> findAll(){
        return p.findAll();
    }

    @GetMapping(value = "/consulta")
    public ProdutoDTO findById(@PathParam("id")   Integer id){
        return p.findById(id);
    }

    @PostMapping
    public ResponseEntity<Response> saveAll(@RequestBody ProdutoRequestDTO body){

        try {
            p.saveAll(body);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Response(e.getMessage(), new ProdutoDTO(body)));
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(new Response("Produto criado com sucesso", null));
    }

    @PutMapping
    public ResponseEntity<Response> updateProdutoByID(@PathParam("id") Integer id, @RequestBody ProductUpdateDTO productUpdateDTO){

        ProdutoDTO produtoAtualizado = null;
        try {
            produtoAtualizado = p.updateProduto(productUpdateDTO.nome(), productUpdateDTO.cor(), productUpdateDTO.preco(), id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).body(new Response("Produto não atualizado", produtoAtualizado));
        }

        return ResponseEntity.status(HttpStatus.OK).body(new Response("Produto atualizado com sucesso", produtoAtualizado));
    }

    @DeleteMapping
    public ResponseEntity<Response> deleteById(@PathParam("id") Integer id){
        p.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(new Response("Produto excluído com sucesso", null));
    }

}
