package com.comp301.lec17.ex2;

public class UNCFan implements Fan {
  public void update(Game g) {
    if (g.whoIsWinning().equals("UNC")) {
      System.out.println("UNC Fan: Go Heels!");
    }
  }
}
