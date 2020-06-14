package com.fiap.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.fiap.produto.*;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/produtos")
    private List<Produto> getAllProdutcs() {
        return produtoService.getAllProdutcs();
    }

    @GetMapping("/produtos/{id}")
    private Produto getProduto(@PathVariable("id") int id) {
        return produtoService.getProductById(id);
    }

    @DeleteMapping("/produtos/{id}")
    private void deleteProduto(@PathVariable("id") int id) {
      produtoService.delete(id);
    }

    @PostMapping("/produtos")
    private int saveProduto(@RequestBody Produto produto) {
      produtoService.saveOrUpdate(produto);
        return produto.getId();
    }
}