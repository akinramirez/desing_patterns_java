package com.akinramirez.singleton;

public class ThreadSafeSingleton {

  private volatile static ThreadSafeSingleton uniqueInstance;

  public static ThreadSafeSingleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (ThreadSafeSingleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new ThreadSafeSingleton();
        }
      }
    }
    return uniqueInstance;
  }
}
