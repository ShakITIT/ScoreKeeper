package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Display the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the given score for Team A by 3 points.
     */
    public void kakhow(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the given score for Team A by 2 points.
     */
    public void yackyack(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the given score for Team A by 1 points.
     */
    public void schew(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Display the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the given score for Team b by 3 points.
     */
    public void kakhow2(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the given score for Team b by 2 points.
     */
    public void yackyack2(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the given score for Team b by 1 points.
     */
    public void schew2(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Resets the score to 0 for both teams.
     */
    public void rewind (View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
