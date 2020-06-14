package com.fiap.produto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {
   @RequestMapping(value = "/{product_id}" , method = RequestMethod.GET)  
   public HashMap<String, Object> get(@PathVariable("product_id") String product_id) {
      HashMap<String, Object> map = new HashMap<>();

      switch (product_id) {
         case "1":
            map.put("product_id", "1");
            map.put("product_name", "Livro Manual Devops ");
            map.put("type_id", "Livros");
            map.put("product_desc", "Livro Manual Devops Edicao comemorativa da gambiarra");
            map.put("product_size", "1");
            map.put("product_price", "100.00");
            break;
         case "2":
            map.put("product_id", "2");
            map.put("product_name", "Alexa");
            map.put("type_id", "Eletronicos");
            map.put("product_desc", "Alexa que fala com voce");
            map.put("product_size", "3");
            map.put("product_price", "400.00");
            break;
         case "3":
            map.put("product_id", "3");
            map.put("product_name", "Kindle");
            map.put("type_id", "Eletronicos");
            map.put("product_desc", "Quase igual o IPad");
            map.put("product_size", "2");
            map.put("product_price", "200.00");
            break;
         default:
            map.put("error", "Product not found");
            break;
      }
      return map;
   }
}