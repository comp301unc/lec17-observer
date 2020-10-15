package com.comp301.lec17.ex3;

public interface GameEvent {
  // Gets the type of event as a String
  public String getType();

  // Gets the team that scored as a String
  public String getWhoScored();
}
