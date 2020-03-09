package com.akinramirez.proxy;

// Proxy (loggin), implementa la misma interfaz que el sujero real
// Es el intermediario
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceLogger implements UserService {

  private UserService userService;
  private Logger logger;

  public UserServiceLogger(UserService service) {
    userService = service;
    logger = LoggerFactory.getLogger(UserServiceLogger.class);
  }

  @Override
  public boolean save(String userName) {
    logger.info("Antes de guardar el usuario " + userName);
    boolean result = userService.save(userName);
    String message = result ? "Usuario guardado : " + userName : "Usuario No Guardado: " + userName;
    logger.info(message);
    return result;
  }

}
