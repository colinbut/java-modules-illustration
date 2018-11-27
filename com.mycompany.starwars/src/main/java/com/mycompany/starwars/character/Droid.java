package com.mycompany.starwars.character;

import java.util.List;

public class Droid {

  private List<Attack> attacks;

  public List<Attack> getAttacks() {
    return attacks;
  }

  public void setAttacks(List<Attack> attacks) {
    this.attacks = attacks;
  }
}
