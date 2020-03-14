package com.akinramirez.adapter;

public class AdapterClient {

  private EmailSender sender;

  public AdapterClient(EmailSender sender) {
    this.sender = sender;
  }

  public void execute() {

    String from = "hola@manuelzapata.co";
    String to = "cursos@manuelzapata.co";
    String subject = "Mensaje desde un adaptador";
    String body = "Vamos, vamos, vamos.";

    /* Aquí se hace el llamado el método, pero el cliente no sabe realmente con qué adaptador en particular está
     * trabajando. Ese es el poder de la interfaces y programar contra abstracciones :) */
    sender.send(from, to, subject, body);
  }
}
