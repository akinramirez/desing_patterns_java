package com.akinramirez.proxy;

public class ProxyApp {
  
  // Clase ejecutable
  public static void main(String[] args) {

    // Sujeto Real -> Quien realiza la accion
    UserService service = new BaseUserService();

    // Proxy
    UserService proxy = new UserServiceLogger(service);

    // Cliente
    ProxyClient client = new ProxyClient(proxy);
    client.saveUser("akin.ramirez@hotmail.com");

  }
}
