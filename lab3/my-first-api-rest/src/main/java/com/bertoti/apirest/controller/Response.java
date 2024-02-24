package com.bertoti.apirest.controller;

import com.bertoti.apirest.entities.Produto;
import com.bertoti.apirest.entities.ProdutoDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason="To show an example of a custom message")
public class Response{
    private String statusMessage;
    private ProdutoDTO p;

    public Response(String message, ProdutoDTO p) {
        this.statusMessage = message;
        this.p = p;
    }

}
