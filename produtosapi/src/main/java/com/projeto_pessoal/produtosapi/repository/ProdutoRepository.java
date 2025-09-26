package com.projeto_pessoal.produtosapi.repository;

import com.projeto_pessoal.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, String>{
}
