package code.project.projectcode;

//import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnSuccessListener;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database .DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.storage.FirebaseStorage;

//import com.google.firebase.storage.StorageReference;
//import com.google.firebase.storage.UploadTask;
/*
Created By Sean Danagher
TEAM PANADA
PROJECT CODE
 */

import com.google.firebase.database.DataSnapshot;

public class DBHandler {



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