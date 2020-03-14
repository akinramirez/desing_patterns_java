package com.akinramirez.adapter;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import java.io.IOException;


public class SendGridAdapter implements EmailSender {

  @Override
  public void send(String from, String to, String subject, String body) {
    //En este caso, el adaptee es un conjunto de clases en la librería de SendGrid.
    Email fromAddress = new Email(from);
    Email toAddress = new Email(to);
    Content content = new Content("text/plain", body);
    Mail mail = new Mail(fromAddress, subject, toAddress, content);

    SendGrid sg = new SendGrid("SENDGRID_API_KEY");
    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      sg.api(request);
      System.out.println("Mensaje enviado con el adaptador de SendGrid");
    } catch (IOException ex) {
      ex.printStackTrace();
      System.out.println("No se pudo enviar mensaje con el adaptador de SendGrid");
    }
  }

}
