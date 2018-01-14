package com.example.tutorials;

/**
 * Created by n01136212 on 1/14/2018.
 */

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;


public class Tab3Quiz extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3_quiz, container, false);
        return rootView;
    }

}
