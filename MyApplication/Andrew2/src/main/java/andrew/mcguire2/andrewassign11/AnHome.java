package andrew.mcguire2.andrewassign11;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.text.DateFormat;

/**
 * Created by Andrew McGuire
 * N01121995
 *   Assignment 2
 */

public class AnHome extends Fragment{

    public AnHome()
    {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceSate)
    {
        View view = inflater.inflate(R.layout.an_home,container,false);
        //Belongs in Home Fragment
        TextView textView = (TextView)view.findViewById(R.id.date);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());

        // textView will display the date
        textView.setText(currentDateTimeString);


        InputStreamReader in;
        BufferedReader reader;
        try {
                in = new InputStreamReader(view.getContext().getAssets().open("andrew.txt"));
                reader = new BufferedReader(in);
                String line = reader.readLine();
                List<String> courses = new ArrayList<String>();

                while (line != null) {
                    courses.add(line);
                    line = reader.readLine();
                }
                reader.close();
                Spinner spinner = (Spinner) view.findViewById(R.id.course);
                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_spinner_item, courses);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(dataAdapter);
                // I don't know why this isn't setting the prompt
                spinner.setPrompt("Andrew McGuire");
        }
            catch(Exception ex)
            {
                ex.printStackTrace();
                Log.d("File error", ex.toString());
            }





        return view;
    }


}
