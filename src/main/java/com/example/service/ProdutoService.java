package com.example.service;

import com.example.domain.Produto;
import com.example.repository.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository produtoRepository = new ProdutoRepository();

    public void saveProduto(Produto produto) {
        // Validação de negócios
        if (produto.getNome() == null || produto.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio");
        }
        produtoRepository.save(produto);
    }
}
