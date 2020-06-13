package com.fiap.produto;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/produto")

public class ProdutoController {
   @RequestMapping(value = "/descricao/{product_id}", method = RequestMethod.GET)  
   @ResponseBody
   public String descricao(@PathVariable("product_id") int produc_id){
      return "Produto = " + produc_id;
   }
}

