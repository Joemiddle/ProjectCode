package code.project.projectcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ProjectActivity extends AppCompatActivity {

    public boolean morseTtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        Button send = (Button) findViewById(R.id.send);
        morseTtext = true;

        final ToggleButton morseToggle = (ToggleButton)findViewById(R.id.morse);
        morseToggle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               if(morseToggle.isChecked())
                   morseTtext = false;
                else
                    morseTtext = true;
            }
        });

        //Selected the send message
        send.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(morseTtext)
                {
                    EditText messageText = (EditText)findViewById(R.id.message);

                    String message = messageText.getText().toString();

                    if(morseTtext)
                        message = MorseToText.fromMorse(message);

                    else
                        message = TextToMorse.textToMorse(message);

                    // now needs to display message
                }

            }
        });



    }
}
