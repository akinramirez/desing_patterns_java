package com.akinramirez.command;

import java.util.ArrayList;

// Invocador
public class Grid {

  private ArrayList<Product> products;
  private Command command;

  public Grid() {
    products = new ArrayList<>();
    //Datos de Prueba
    products.add(new Product(101, "Mesa vintage"));
    products.add(new Product(102, "Silla chic"));
    products.add(new Product(103, "Lampara clasica"));
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void update() {
    System.out.println("Desde el metodo update de la grilla");
    for (Product product : products) {
      //TODO: guardar cada producto
      command.execute(product);
    }
  }
}
