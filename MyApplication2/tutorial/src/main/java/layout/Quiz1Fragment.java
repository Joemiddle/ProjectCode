package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.tutorial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Quiz1Fragment extends Fragment {

    Button ans1, ans2, ans3, ans4;
    TextView text1;

    private String Question [][] = {
            {"How do you represent SOS?"},
            {"How do you represent the letter R?"},
            {"How do you represent the letter A?"},
    };

    private String Options[][] = {
            {"...---...", "---...---", "..----..-", "--.-.---."},
            {"-.", "--", ".-.", "--."},
            {"-.", "--", ".-", "--"},
    };

    private String Answers[] = {"...---...", ".-.", ".-"};


    public String[] Retrieve(int x){
        String[] question = Question[x];
        return question;
    }

    public Quiz1Fragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ans1 = (Button) findViewById(R.id.ans1);
        ans2 = (Button) findViewById(R.id.ans2);
        ans3 = (Button) findViewById(R.id.ans3);
        ans4 = (Button) findViewById(R.id.ans4);

        text1 = (TextView) findViewById(R.id.text1);

        ans1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){



            }
        });

        ans2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){



            }
        });

        ans3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){



            }
        });

        ans4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){



            }
        });

        return inflater.inflate(R.layout.fragment_quiz1, container, false);
    }

}
