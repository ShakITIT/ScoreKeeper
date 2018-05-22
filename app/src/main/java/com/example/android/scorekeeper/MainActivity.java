package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    int scoreJordan = 0;
    int scoreLebron = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForJordan(0);
        displayForLebron(0);
    }

    /**
     * Display the given score for Jordan.
     */
    public void displayForJordan(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Jordan_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the given score for Jordan by 1 points.
     */
    public void points(View v){
        scoreJordan = scoreJordan + 1;
        displayForJordan(scoreJordan);
    }

    /**
     * Increase the given score for Jordan by 2 points.
     */
    public void rebounds(View v){
        scoreJordan = scoreJordan + 2;
        displayForJordan(scoreJordan);
    }

    /**
     * Increase the given score for Jordan by 2 points.
     */
    public void assists(View v){
        scoreJordan = scoreJordan + 2;
        displayForJordan(scoreJordan);
    }

    /**
    * Increase the given score for Jordan by 3 points.
    */
    public void steals (View v){
        scoreJordan = scoreJordan + 3;
        displayForJordan(scoreJordan);
    }

    /**
    * Increase the given score for Jordan by 3 points.
    */
    public void blocks (View v){
        scoreJordan = scoreJordan + 3;
        displayForJordan(scoreJordan);
    }

    /**
     * Display the given score for Lebron.
     */
    public void displayForLebron(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Lebron_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the given score for Lebron by 1 points.
     */
    public void points2(View v){
        scoreLebron = scoreLebron + 1;
        displayForLebron(scoreLebron);
    }

    /**
     * Increase the given score for Lebron by 2 points.
     */
    public void rebounds2(View v){
        scoreLebron = scoreLebron + 2;
        displayForLebron(scoreLebron);
    }

    /**
     * Increase the given score for Lebron by 3 points.
     */
    public void blocks2(View v){
        scoreLebron = scoreLebron + 3;
        displayForLebron(scoreLebron);
    }

    /**
     * Resets the score to 0 for both players.
     */
    public void replay (View v){
        scoreJordan = 0;
        scoreLebron = 0;
        displayForJordan(scoreJordan);
        displayForLebron(scoreLebron);
    }
}
