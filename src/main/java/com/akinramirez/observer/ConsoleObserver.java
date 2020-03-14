package com.akinramirez.observer;
/**
 * Observador concreto (concrete observer).
 *
 * Los objetos de esta clase serán llamados cuando el evento o notificación ocurra, siempre y cuando los objetos
 * estén registrados ante el sujeto.
 *
 * Debe implementar la interfaz Observer.
 *
 * En este ejemplo, solo tenemos una clase observadora pero podrían haber muchos más.
 *
 * */
public class ConsoleObserver implements Observer {

  @Override
  public void update(Earthquake earthquake) {

    System.out.println("Movimientos sísmico!");

    String location = String.format("Ubicación: (%.5f, %.5f)",
            earthquake.getLatitude(),
            earthquake.getLongitude());
    System.out.println(location);
    System.out.println("Magnitud: " + earthquake.getMagnitude());
    System.out.println("Fecha: " + earthquake.getDateTime()); 

  }

}
