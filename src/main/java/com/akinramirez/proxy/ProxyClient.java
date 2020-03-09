package com.akinramirez.proxy;

public class ProxyClient {
  
  // Sujeto
  private UserService userService;

  // Cliente, es quien va a llamar el servicio que necesite o sea al sujeto (UserService)
  public ProxyClient(UserService service) {
    userService = service;
  }

  public void saveUser(String userName) {
    //Logica de negocio...
    userService.save(userName);
    //Logica...

  }
}
