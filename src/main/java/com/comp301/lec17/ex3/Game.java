package com.comp301.lec17.ex3;

public interface Game {
  // Registers an observer by adding it to the list
  void addObserver(Fan o);

  // De-registers an observer by removing it from the list
  void removeObserver(Fan o);

  // Calls update() on each observer to notify them of an event
  void notifyObservers(GameEvent e);

  // Updates the scoreboard and notifies observers when a team scores
  void scorePoints(String team, int points_to_add);

  // Prints the current score to System.out
  void printScore();

  // Returns the winning team as a String
  String whoIsWinning();
}
