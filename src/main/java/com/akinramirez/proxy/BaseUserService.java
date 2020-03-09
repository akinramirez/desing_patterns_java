package com.akinramirez.proxy;

import java.util.ArrayList;

// Sujeto real es quien realiza la accion, implementa la interfaz del sujeto
// Recurso origen
public class BaseUserService implements UserService {

  private ArrayList<String> users;

  public BaseUserService() {
    users = new ArrayList<>();
  }

  @Override
  public boolean save(String userName) {
    boolean result = false;

    if (!users.contains(userName)) {
      users.add(userName);
      result = true;
    }

    return result;
  }

}
