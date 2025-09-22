package com.projeto_pessoal.produtosapi.controller;


import com.projeto_pessoal.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // mostra para o Spring que é uma classe controller
@RequestMapping ("/produtos")
public class ProdutoController {

    @PostMapping // Post é para enviar/ salvar dados
    public Produto salvar (@RequestBody Produto produto){  // diz que esse objeto é o que vai vir no body da requisição
        System.out.println("Produto recebido: " + produto);
                return produto;

    }
}
