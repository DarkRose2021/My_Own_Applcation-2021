package com.example.myownapplcation;

import java.util.Random;

public class RockPaperScissors {
  //rock = 1
  //paper = 2
  //scissors = 3
  //spock = 4
  //lizard = 5
   int computerPlays;
   int playerPlays;

   public int generateComputerPlays(){
       Random computerPlays = new Random();
       return computerPlays.nextInt((5 - 1)+ 1) + 1;
   }

    public String checkForWinner(){
       if(playerPlays == 1 && computerPlays == 3 || playerPlays == 1 && computerPlays == 5
         || playerPlays == 2 && computerPlays == 1 || playerPlays == 2 && computerPlays == 5
         || playerPlays == 3 && computerPlays == 2 || playerPlays == 3 && computerPlays == 5
         || playerPlays == 4 && computerPlays == 1 || playerPlays == 4 && computerPlays == 3
         || playerPlays == 5 && computerPlays == 2 || playerPlays == 5 && computerPlays == 4){
           return "Player Wins!";
       }else if(computerPlays == 1 && playerPlays == 3 || computerPlays == 1 && playerPlays == 5
               || computerPlays == 2 && playerPlays == 1 || computerPlays == 2 && playerPlays == 5
               || computerPlays == 3 && playerPlays == 2 || computerPlays == 3 && playerPlays == 5
               || computerPlays == 4 && playerPlays == 1 || computerPlays == 4 && playerPlays == 3
               || computerPlays == 5 && playerPlays == 2 || computerPlays == 5 && playerPlays == 4){
           return "Computer Wins!";
       }else{
           return "Tie Game";
       }
    }
}
