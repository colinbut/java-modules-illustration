package com.mycompany.starwars.ships;

public class XWing extends Starship {

  private static final int NUMBER_OF_MISSILES = 4;

  private String name;
  private int numberOfMissilesFired = 1;

  @Override
  public void fire() {
    System.out.println("XWing: fire!");
  }

  public void launchMissiles() {
    System.out.println("About to fire missile");

    if (numberOfMissilesFired >= NUMBER_OF_MISSILES) {
      System.out.println("XWing: no more missile to fire");
    }

    while (numberOfMissilesFired < NUMBER_OF_MISSILES) {
      System.out.println("XWing: fire missile!");
    }
  }
}
