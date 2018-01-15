package com.example.tutorials;


/*
Createed By Radhika Hira
TEAM PANADA
PROJECT CODE
 */

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;


public class Tab3Quiz extends Fragment{

    private TextView question;

    private String answer;

    private RadioGroup group;

    private RadioButton ans1, ans2, ans3, ans4;


    private DatabaseReference RefQuestion, RefAns1, RefAns2, RefAns3, RefAns4, RefCorrectAnswer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3_quiz, container, false);

        question = (TextView) rootView.findViewById(R.id.question)


        return rootView;
    }

}
