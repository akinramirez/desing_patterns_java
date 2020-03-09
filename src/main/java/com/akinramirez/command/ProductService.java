package com.akinramirez.command;

//Receptor
import java.util.ArrayList;

public class ProductService {

  ArrayList<Product> products;

  public ProductService() {
    products = new ArrayList<>();

  }

  public void save(Product product) {
    System.out.println("Guardando producto " + product.getName());
    products.add(product);
  }

}
