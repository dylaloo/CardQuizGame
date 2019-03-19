package com.example.cardquizgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalScreen extends AppCompatActivity {
    public static final String TOTAL_SCORE = "com.example.cardquizgame.TOTAL_SCORE";
    double newscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);

        Intent Intent = getIntent();
        newscore = Intent.getDoubleExtra(Question5.TOTAL_SCORE,0);
        double perc = (newscore / 5.0) *100;
        String text = Double.toString(newscore);
        String text2 = Double.toString(perc);
        TextView number = (TextView)findViewById(R.id.number);
        TextView percent = (TextView)findViewById(R.id.percent);

        number.setText(text + "/5");
        percent.setText(text2);
    }
}
