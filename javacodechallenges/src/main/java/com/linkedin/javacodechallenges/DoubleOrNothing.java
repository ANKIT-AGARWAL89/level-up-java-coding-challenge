package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

   
    public boolean askChoice(){
    System.out.println("do you want to play this game or want to exit with 10 points? play = true or do not want to play = false");
    Scanner sc = new Scanner(System.in);
    boolean choice = sc.nextBoolean();
    return choice;

  }

  public void playGame() {
    System.out.println("You have 10 points.");
    int currentPoints = 10;
    Random random = new Random();
    boolean wantToPlay = askChoice();
    while (wantToPlay) {
      boolean turn = random.nextBoolean();
      if(turn){
        currentPoints*=2;
        System.out.println("your current points: " + currentPoints);
        wantToPlay = askChoice();
      }
      else{
        currentPoints*=0;
        wantToPlay = false; 
      }
    }
    System.out.println("your final points: "+ currentPoints);
}
  
}