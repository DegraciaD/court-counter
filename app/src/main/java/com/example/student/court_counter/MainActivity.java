package com.example.student.court_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamAwesome = 0;
    private int scoreTeamJosh = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamAwesome(0);
        displayForTeamJosh(0);
    }

    private void displayForTeamAwesome(int score){
        TextView scoreTeamAwesome = (TextView) findViewById(R.id.txtVw_scoreTeamAwesome);
        if(scoreTeamAwesome!=null)
            scoreTeamAwesome.setText(String.valueOf(score));
    }

    private void displayForTeamJosh(int score){
        TextView scoreTeamJosh = (TextView) findViewById(R.id.txtVw_scoreTeamJosh);
        if(scoreTeamJosh!=null)
            scoreTeamJosh.setText(String.valueOf(score));
    }


    public void addOneForTeamAwesome(View view) {
        int step = 1;
        scoreTeamAwesome += step;
        displayForTeamAwesome(scoreTeamAwesome);
    }

        public void addOneForTeamJosh(View view) {
            int step = 1;
            scoreTeamJosh += step;
            displayForTeamJosh(scoreTeamJosh);
        }

    }

