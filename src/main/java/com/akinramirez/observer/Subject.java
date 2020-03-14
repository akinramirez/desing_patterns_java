package com.akinramirez.observer;

public interface Subject {

  void subscribe(Observer observer);

  void unsubscribe(Observer observer);

  void notifyObservers(Earthquake earthquake);
}
