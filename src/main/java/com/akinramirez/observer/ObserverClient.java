package com.akinramirez.observer;

public class ObserverClient {

  public static void main(String[] args) {
    Observer observer = new ConsoleObserver();
    GeolicalService subject = new GeolicalService();

    subject.subscribe(observer);
    subject.tremble();

    subject.unsubscribe(observer);

    subject.unsubscribe(observer);
    subject.tremble();
  }
}
