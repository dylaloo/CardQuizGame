package com.example.cardquizgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class QuestionOne extends AppCompatActivity {
    public static final String TOTAL_SCORE = "com.example.cardquizgame.TOTAL_SCORE";


    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;

    Button Submit;
    double score = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        checkBox1 = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox)findViewById(R.id.checkBox5);


        Submit = (Button) findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()){
                    score = score + 0.25;
                }
                if(checkBox2.isChecked()){
                    score = score + 0.25;
                }
                if(checkBox3.isChecked()){
                    score = score + 0.25;
                }
                if(checkBox5.isChecked()){
                    score = score + 0.25;
                }


                if (checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked()|| checkBox4.isChecked() || checkBox5.isChecked()) {
                    Intent LoginIntent = new Intent(QuestionOne.this, QuestionTwo.class);
                    LoginIntent.putExtra(TOTAL_SCORE, score);
                    startActivity(LoginIntent);
                }else{
                    Toast.makeText(QuestionOne.this, "Please make a selection.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
