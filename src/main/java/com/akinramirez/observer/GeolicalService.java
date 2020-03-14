package com.akinramirez.observer;

//Sujeto concreto
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GeolicalService implements Subject {

  private List<Observer> observers;

  public GeolicalService() {
    observers = new ArrayList<>();
  }

  @Override
  public void subscribe(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void unsubscribe(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers(Earthquake earthquake) {

    System.out.println("Antes de notificar a los observadores");

    for (Observer observer : observers) {
      observer.update(earthquake);
    }

    System.out.println("Los observadores han sido notificados");
  }

  /**
   * Con este método vamos a simular que el terremoto ocurrió.
   *
   * Dependiendo de la implementación, un tercero le podría decir al sujeto que
   * notifique, pero el sujeto también podría detectar con su lógica interna que
   * el evento ocurrió.
   *
   */
  public void tremble() {
    //Objeto con datos de prueba que representa el evento.
    Earthquake earthquake = new Earthquake(30.3207200, 35.4839200, 6, LocalDateTime.now());
    //Como sabemos que el evento "ocurrió", debemos notificar a los observadores.
    notifyObservers(earthquake);
  }

}
