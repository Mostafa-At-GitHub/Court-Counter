package com.example.ahmed.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView teamAscore ;
    TextView teamBscore ;
    int scoreA = 0 ;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAscore= (TextView)findViewById(R.id.ScoreA_text_view) ;
        teamBscore= (TextView)findViewById(R.id.ScoreB_text_view) ;
    }

    public void addThreeForTeamA(View view) {
        scoreA+=3;
        displayTeamAScore(scoreA);
    }

    public void addTwoForTeamA(View view) {
        scoreA+=2;
        displayTeamAScore(scoreA);
    }

    public void addOneForTeamA(View view) {
        scoreA+=1;
        displayTeamAScore(scoreA);
    }
    public void addThreeForTeamB(View view) {
        scoreB+=3;
        displayTeamBScore(scoreB);
    }

    public void addTwoForTeamB(View view) {
        scoreB+=2;
        displayTeamBScore(scoreB);
    }

    public void addOneForTeamB(View view) {
        scoreB+=1;
        displayTeamBScore(scoreB);
    }





    public void displayTeamAScore(int s){

        teamAscore.setText(String.valueOf(s));


    }
    public void displayTeamBScore(int s){

        teamBscore.setText(String.valueOf(s));


    }


    public void restMatch(View view) {
        scoreA=0 ;
        scoreB=0;
        teamAscore.setText(String.valueOf(scoreA));
        teamBscore.setText(String.valueOf(scoreB));

//       this.finish();

    }
}
