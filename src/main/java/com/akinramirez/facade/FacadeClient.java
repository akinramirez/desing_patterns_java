package com.akinramirez.facade;

public class FacadeClient {

  public static void main(String[] args) {
    FileManager manager = new FileManager();
    int count = manager.countCaracters("C:/Users/Akin Ramirez/Documents/NetBeansProjects/desing_patterns/src/main/java/resources/test.txt");
    System.out.println("Numero de carateres: " + count);
  }
}
