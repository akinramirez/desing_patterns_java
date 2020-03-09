package com.akinramirez.command;

import java.util.Random;

// Invocador
public class Form {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void save() {
    System.out.println("Desde el metodo save del formulario");
    Product product = getProduc();
    // TODO: Llamar el comando
    command.execute(product);
  }

  private Product getProduc() {
    int id = new Random().nextInt(1000);
    Product product = new Product(id, "Product " + id);
    return product;
  }
}
