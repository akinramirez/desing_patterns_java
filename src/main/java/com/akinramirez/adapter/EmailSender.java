package com.akinramirez.adapter;

//Objetivo
public interface EmailSender {

  void send(String from, String to, String subject, String body);
  
}
