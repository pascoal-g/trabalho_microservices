package com.fiap.produto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "PRODUTO")
public class Produto {
   @Id
   @GeneratedValue
   public int id;
   public String name; 
   public int type;
   public String desc;
   public int price;
   public Integer getId() {
      return id;
  }

}