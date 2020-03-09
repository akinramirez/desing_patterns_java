package com.akinramirez.command;

public class SaveCommand implements Command {
  
  ProductService service;
  
  public SaveCommand(ProductService service) {
    this.service = service;
  }
  
  @Override
  public void execute(Product product) {
    //Llamar al receptor
    service.save(product);
  }
  
}
