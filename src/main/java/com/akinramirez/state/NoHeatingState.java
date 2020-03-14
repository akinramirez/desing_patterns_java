package com.akinramirez.state;

import java.time.Duration;

public class NoHeatingState implements State {

  private MicrowaveOven context;

  public NoHeatingState(MicrowaveOven oven) {
    context = oven;
  }

  @Override
  public boolean start(Duration duration) {
    context.changeState(new HeatingState(context));
    return true;
  }

  @Override
  public boolean stop() {
    return false;
  }

  @Override
  public boolean openDoor() {
    return true;
  }

}
