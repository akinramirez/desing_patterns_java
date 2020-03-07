package com.akinramirez.facade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class FileManager {

  public int countCaracters(String filePath) {
    int count = 0;
    try {
      FileReader fileReader = new FileReader(filePath);
      try {
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while (line != null) {
          count += line.length();
          line = bufferedReader.readLine();
        }
      } catch (IOException ex) {
        ex.getMessage();
      }
    } catch (IOException exception) {
      exception.getMessage();
    }
    return count;
  }
}
