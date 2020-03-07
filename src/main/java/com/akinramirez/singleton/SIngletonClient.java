package com.akinramirez.singleton;

public class SIngletonClient {

  public static void main(String[] args) {
    Singleton singletonOne = Singleton.getInstance();
    Singleton singletonTwo = Singleton.getInstance();

    System.out.println(singletonOne == singletonTwo ? "Solo hay una instancia singleton" : "El singleton ha fallado");

    ThreadSafeSingleton threadSafeSingletonOne = ThreadSafeSingleton.getInstance();
    ThreadSafeSingleton threadSafeSingletonTwo = ThreadSafeSingleton.getInstance();
    System.out.println(threadSafeSingletonOne == threadSafeSingletonTwo ? 
            "Solo hay una Instancia threadSafe" : "El singleton threadSafe ha fallado");
  }
}
