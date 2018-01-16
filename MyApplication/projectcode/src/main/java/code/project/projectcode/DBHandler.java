/*package code.project.projectcode;

//import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnSuccessListener;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database .DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//import com.google.firebase.storage.FirebaseStorage;

//import com.google.firebase.storage.StorageReference;
//import com.google.firebase.storage.UploadTask;
/*
Created By Sean Danagher
TEAM PANADA
PROJECT CODE
/

import com.google.firebase.database.DataSnapshot;

public class DBHandler {
/*


    DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();


    public DBHandler() {




        }


        DatabaseReference Question = FirebaseDatabase.getInstance()
                .getReferenceFromUrl("https://projectcode-c86ed.firebaseio.com/Tutorials/1/Question");
        DatabaseReference Choice1 = FirebaseDatabase.getInstance()
                .getReferenceFromUrl("https://projectcode-c86ed.firebaseio.com/Tutorials/1/PA1");


    public void OnDataChange(DataSnapshot dataSnapshot) {

    }

    public void onCancelled(DatabaseError databaseError) {
    }


}
}
/
public JSONObject Tutorial1;
public JSONObject Tutorial2;
public JSONObject Tutorial3;
public JSONObject Tutorial4;
public JSONObject Tutorial5;

public DBHandler() {

    Tutorial1 = new JSONObject();
    try {
        Tutorial1.put("Question", "2");
        Tutorial1.put("PA1", "NAME OF STUDENT2");
        Tutorial1.put("PA2", "4rd");
        Tutorial1.put("PA3", "scicence");
        Tutorial1.put("PA4", "5/5/1993");

    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    JSONObject Tutorial2 = new JSONObject();
    try {
        Tutorial2.put("Question", "2");
        Tutorial2.put("PA1", "NAME OF STUDENT2");
        Tutorial2.put("PA2", "4rd");
        Tutorial2.put("PA3", "scicence");
        Tutorial2.put("PA4", "5/5/1993");

    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    JSONObject Tutorial3 = new JSONObject();
    try {
        Tutorial3.put("Question", "2");
        Tutorial3.put("PA1", "NAME OF STUDENT2");
        Tutorial3.put("PA2", "4rd");
        Tutorial3.put("PA3", "scicence");
        Tutorial3.put("PA4", "5/5/1993");

    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    JSONObject Tutorial4 = new JSONObject();
    try {
        Tutorial4.put("Question", "2");
        Tutorial4.put("PA1", "NAME OF STUDENT2");
        Tutorial4.put("PA2", "4rd");
        Tutorial4.put("PA3", "scicence");
        Tutorial4.put("PA4", "SoemthingElse");

    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    JSONObject Tutorial5 = new JSONObject();
    try {
        Tutorial5.put("Question", "2");
        Tutorial5.put("PA1", "NAME OF STUDENT2");
        Tutorial5.put("PA2", "4rd");
        Tutorial5.put("PA3", "scicence");
        Tutorial5.put("PA4", "5/5/1993");

    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }


    JSONArray jsonArray = new JSONArray();

    jsonArray.put(Tutorial1);
    jsonArray.put(Tutorial2);

    JSONObject studentsObj = new JSONObject();
    studentsObj.put("Students", jsonArray);



    String jsonStr = studentsObj.toString();

    System.out.println("jsonString: "+jsonStr);


}

JSONArray quizes = new JSONArray()
    {
        "Tutorials" : {
        "1" : {
        "Answer" : "...---...",
        "PA1" : "...---...",
        "PA2" : "---...---",
        "PA3" : "..----..-",
        "PA4" : "--.-.---.",
        "Question" : "How do you represent SOS?"
        },
        "2" : {
        "Answer" : ".-.",
        "PA1" : "-.",
        "PA2" : "--",
        "PA3" : ".-.",
        "PA4" : "--",
        "Question" : "How do you represent the letter R?"
        },
        "3" : {
        "Answer" : ".-",
        "PA1" : "-.",
        "PA2" : "--",
        "PA3" : ".-",
        "PA4" : "--",
        "Question" : "How do you represent the letter A?"
        },
        "4" : {
        "Answer" : ".----",
        "PA1" : "..---",
        "PA2" : "--...",
        "PA3" : ".----",
        "PA4" : "-----",
        "Question" : "How do you represent the Number 1?"
        },
        "5" : {
        "Answer" : "-....",
        "PA1" : "...--",
        "PA2" : "-....",
        "PA3" : ".----",
        "PA4" : "----.",
        "Question" : "How do you represent the Number 6?"
        }
        }
        }
*/