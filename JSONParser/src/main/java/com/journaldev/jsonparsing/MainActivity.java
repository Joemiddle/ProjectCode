package com.journaldev.jsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Morse Code Lessons";
    String json_string = "{\n" +
            "  \"title\":\"Lesson1\",\n" +
            "  \"array\":[\n" +
            "    {\n" +
            "    \"P/A1\":\"Google\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"P/A2\":\"Radhika\"\n" +
            "    },\n" +
            "    {\n" +
            "    \"P/A3\":\"Humber\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"P/A4\" : \"Microsoft\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"Answer\": \"Apple\"\n" +
            "    }\n" +
             "   {\n" +
            "    ],\n" +
            "    \"nested\":{\n" +
            "    \"flag\": true,\n" +
            "    \"random_number\":1\n" +
            "    }\n" +
            "}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");
        /*try {

            ListView listView = (ListView) findViewById(R.id.list_view);
            
            List<String> items = new ArrayList<>();
            JSONObject root = new JSONObject(json_string);

            JSONArray array= root.getJSONArray("array");

            this.setTitle(root.getString("title"));

            for(int i=0;i<array.length();i++)
            {
                JSONObject object= array.getJSONObject(i);
                items.add(object.getString("company"));
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, items);

            if (listView != null) {
                listView.setAdapter(adapter);
            }

            JSONObject nested= root.getJSONObject("nested");
            Log.d("TAG","flag value "+nested.getBoolean("flag"));

        } catch (JSONException e) {
            e.printStackTrace();
        }*/

        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void addListenerForSingleValueEvent(){

            }
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI
               // Tutorial1 tutorial1 = dataSnapshot.getValue(Tutorial.class);
                // ...
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        };


    }
}
