package com.example.controller;

import com.example.domain.Produto;
import com.example.service.ProdutoService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ProdutoController {

    private Produto produto = new Produto();
    private ProdutoService produtoService = new ProdutoService();

    public void save() {
        try {
            produtoService.saveProduto(produto);
            produto = new Produto(); // Limpa o formulário
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
