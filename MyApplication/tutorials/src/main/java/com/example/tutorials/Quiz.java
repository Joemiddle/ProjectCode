package com.example.tutorials;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

/**
 * Created by n01136212 on 1/14/2018.
 */

public class Quiz extends AppCompatActivity{
    private TextView question;

    private String answer;

    private DatabaseReference RefQuestion, RefAns1, RefAns2, RefAns3, RefAns4, RefCorrectAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab3_quiz);
    }
}
