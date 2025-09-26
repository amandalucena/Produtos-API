package com.projeto_pessoal.produtosapi.controller;


import com.projeto_pessoal.produtosapi.model.Produto;
import com.projeto_pessoal.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController // mostra para o Spring que é uma classe controller
@RequestMapping ("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping // Post é para enviar/ salvar dados
    public Produto salvar (@RequestBody Produto produto){  // diz que esse objeto é o que vai vir no body da requisição
        System.out.println("Produto recebido: " + produto);

        // gera um código hash para o id
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        // salva no banco
        produtoRepository.save(produto);
        return produto;

    }

    @GetMapping ("{id}")
    public Produto obterPorId (@PathVariable ("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }
}
