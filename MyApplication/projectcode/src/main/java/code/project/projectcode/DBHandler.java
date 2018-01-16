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
        Tutorial1.put("Question", "How do you represent SOS?");
        Tutorial1.put("PA1" , "...---...");
        Tutorial1.put("PA2" , "---...---");
        Tutorial1.put("PA3" ,"..----..-");
        Tutorial1.put("PA4","--.-.---.");
        Tutorial1.put("Answer", "...---...");


    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    JSONObject Tutorial2 = new JSONObject();
    try {
        Tutorial2.put("Question", "How do you represent the letter R?");
        Tutorial2.put("PA1", "-.");
        Tutorial2.put("PA2", "--");
        Tutorial2.put("PA3", '.-.");
        Tutorial2.put("PA4", "--');
        Tutorial2.put("Answer", ".-.");
    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    JSONObject Tutorial3 = new JSONObject();
    try {
        Tutorial3.put("Question", "How do you represent the letter A?");
        Tutorial3.put("PA1", "-.");
        Tutorial3.put("PA2", ".-");
        Tutorial3.put("PA3", "--");
        Tutorial3.put("PA4", "--");
        Tutorial3.put("Answer", ".-");
    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    JSONObject Tutorial4 = new JSONObject();
    try {
        Tutorial4.put("Question", "How do you represent #1?");
        Tutorial4.put("PA1", "..---");
        Tutorial4.put("PA2", "--...");
        Tutorial4.put("PA3", ".----");
        Tutorial4.put("PA4", "-----");
        Tutorial4.put("Answer", ".----);

    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    JSONObject Tutorial5 = new JSONObject();
    try {
        Tutorial5.put("Question", "How do you represent #6?");
        Tutorial5.put("PA1", "...--");
        Tutorial5.put("PA2", "-....");
        Tutorial5.put("PA3", ".----");
        Tutorial5.put("PA4", "----.");
        Tutorial5.put("Answer", "-....");

    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }



}

*/