package com.example.myownapplcation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textViewGameFeed, textViewPlayerInput, textViewComputerInput, btnRock, btnPaper, btnScissors, btnNewGame, btnSpock, btnLizard;
    RockPaperScissors game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpTextView();
        game = new RockPaperScissors();
        setUpGame();

    }

    public void setUpGame(){
        game.computerPlays = game.generateComputerPlays();
        updateView("Chose Rock, Paper, Scissors, Spock, or Lizard:");
        toggleUI(false,false,false,false,false, true);
    }

    public void setUpTextView(){
        textViewGameFeed = findViewById(R.id.textViewGameFeed);
        textViewPlayerInput = findViewById(R.id.textViewPlayerInput);
        textViewComputerInput = findViewById(R.id.textViewComputerInput);
    }

    public void updateView(String gameFeedText){
        textViewGameFeed.setText(gameFeedText);
        textViewPlayerInput.setText("");
        textViewComputerInput.setText("");
    }

    public void setComputerPlays(){
        if(game.computerPlays == 1){
            textViewComputerInput.setText("Rock");
        }else if(game.computerPlays == 2){
            textViewComputerInput.setText("Paper");
        }else if(game.computerPlays == 3){
            textViewComputerInput.setText("Scissors");
        }else if(game.computerPlays == 4){
            textViewComputerInput.setText("Spock");
        }else{
            textViewComputerInput.setText("Lizard");
        }
    }

    public void rock(View v){
        game.playerPlays = 1;
        textViewPlayerInput.setText("Rock");
        setComputerPlays();
        toggleUI(true, true, true,true,true, false);
        textViewGameFeed.setText(game.checkForWinner());
    }

    public void paper(View v){
        game.playerPlays = 2;
        setComputerPlays();
        textViewPlayerInput.setText("Paper");
        toggleUI(true, true, true,true,true, false);
        textViewGameFeed.setText(game.checkForWinner());
    }

    public void scissors(View v){
        game.playerPlays = 3;
        setComputerPlays();
        textViewPlayerInput.setText("Scissors");
        toggleUI(true, true, true,true,true, false);
        textViewGameFeed.setText(game.checkForWinner());
    }

    public void spock(View v){
        game.playerPlays = 4;
        setComputerPlays();
        textViewPlayerInput.setText("Spock");
        toggleUI(true, true, true,true,true, false);
        textViewGameFeed.setText(game.checkForWinner());
    }

    public void lizard(View v){
        game.playerPlays = 4;
        setComputerPlays();
        textViewPlayerInput.setText("Lizard");
        toggleUI(true, true, true,true,true, false);
        textViewGameFeed.setText(game.checkForWinner());
    }

    public void newGame(View v){
        setUpGame();
    }

    public void toggleUI(boolean disableRock, boolean disablePaper, boolean disableScissors, boolean disableSpock, boolean disableLizard, boolean disableNewGame){
        findViewById(R.id.btnRock).setEnabled(!disableRock);
        findViewById(R.id.btnPaper).setEnabled(!disablePaper);
        findViewById(R.id.btnScissors).setEnabled(!disableScissors);
        findViewById(R.id.btnSpock).setEnabled(!disableSpock);
        findViewById(R.id.btnLizard).setEnabled(!disableLizard);
        findViewById(R.id.btnNewGame).setVisibility(disableNewGame ? View.INVISIBLE :View.VISIBLE);
    }
}