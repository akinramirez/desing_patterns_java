package com.akinramirez.adapter;

import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;

public class SparkPosAdapter implements EmailSender {

  @Override
  public void send(String from, String to, String subject, String body) {
    //En este caso, el adaptee es la clase Client en la libreria de SparkPost.
    Client client = new Client("API KEY");

    try {
      //La adaptación ocurre al saber qué y cómo tenemos que utilizar la librería de SparkPost.
      client.sendMessage(from, to, subject, body, null);
      System.out.println("Mensaje enviado con el adaptador de SparkPost");
    } catch (SparkPostException e) {
      e.printStackTrace();
      System.out.println("No se pudo enviar mensaje con el adaptador de SparkPost");
    }

  }

}
