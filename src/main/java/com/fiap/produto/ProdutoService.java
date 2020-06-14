package com.fiap.produto;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> getAllProdutcs() {
        List<Produto> produtos = new ArrayList<Produto>();
        produtoRepository.findAll().forEach(produto -> produtos.add(produto));
        return produtos;
    }

    public Produto getProductById(int id) {
        return produtoRepository.findById(id).get();
    }

    public void saveOrUpdate(Produto produto) {
        produtoRepository.save(produto);
    }



    public void delete(int id) {
        produtoRepository.deleteById(id);
    }
}