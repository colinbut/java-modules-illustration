package com.mycompany.starwars.film;

public enum Episode {
  A_NEW_HOPE("A New Hope", 1967),
  THE_EMPIRE_STRIKES_BACK("The Empire Strikes Back", 1969),
  RETURN_OF_THE_JEDI("Return of the Jedi", 1973),
  THE_PHANTOM_MENACE("The phantom menace", 2003),
  ATTACK_OF_THE_CLONES("Attack of the clones", 2007),
  REVENGE_OF_THE_SITH("Revenge of the sith", 2009),
  THE_FORCE_AWAKENS("The force awakens", 2014),
  THE_LAST_JEDI("The Last Jedi", 2017);

  Episode(String title, int year) {
    this.title = title;
    this.year = year;
  }

  private String title;
  private int year;

  public int getYear() {
    return year;
  }

  public String getTitle() {
    return title;
  }
}
