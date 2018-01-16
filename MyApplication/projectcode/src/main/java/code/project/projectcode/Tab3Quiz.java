package code.project.projectcode;
/*
Createed By Radhika Hira
TEAM PANADA
PROJECT CODE
 */

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;


public class Tab3Quiz extends Fragment{

    Questions question;
    int questionnum;
    RadioButton ans1;
    RadioButton ans2;
    RadioButton ans3;
    RadioButton ans4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Handling View
        final View rootView = inflater.inflate(R.layout.tab3_quiz, container, false);


        Button submit = (Button) rootView.findViewById(R.id.submit);

        ans1 = (RadioButton) rootView.findViewById(R.id.ans1);
        ans2 = (RadioButton) rootView.findViewById(R.id.ans2);
        ans3 = (RadioButton) rootView.findViewById(R.id.ans3);
        ans4 = (RadioButton) rootView.findViewById(R.id.ans4);

        //GET QUESTION NUM FROM SHARED PREFEREENCES


        // getNextQuestion();
        question = new Questions("How's the best?","Dude","Other","Gal","Friend","Dude");
        // get question/possible answer from db

        ans1.setText(question.getPA1());
        ans2.setText(question.getPA2());
        ans3.setText(question.getPA3());
        ans4.setText(question.getPA4());

        submit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {


                if( ans1.isChecked())
                {
                    if(question.getAnswer().equals(ans1.getText().toString()))
                    {
                        // Right answer
                        Toast.makeText(Tutorial.getAppContext(), R.string.right, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        //Wrong Answer
                        Toast.makeText(Tutorial.getAppContext(),R.string.wrong, Toast.LENGTH_SHORT).show();
                    }
                }

               else  if( ans2.isChecked())
                {
                    if(question.getAnswer().equals(ans2.getText().toString()))
                    {
                        // Right answer
                        Toast.makeText(Tutorial.getAppContext(), R.string.right, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        //Wrong Answer
                        Toast.makeText(Tutorial.getAppContext(),R.string.wrong, Toast.LENGTH_SHORT).show();
                    }
                }
                 else if( ans3.isChecked())
                {
                    if(question.getAnswer().equals(ans3.getText().toString()))
                    {
                        // Right answer
                        Toast.makeText(Tutorial.getAppContext(), R.string.right, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        //Wrong Answer
                        Toast.makeText(Tutorial.getAppContext(),R.string.wrong, Toast.LENGTH_SHORT).show();
                    }
                }
                else if( ans4.isChecked())
                {
                    if(question.getAnswer().equals(ans4.getText().toString()))
                    {
                        // Right answer
                        Toast.makeText(Tutorial.getAppContext(), R.string.right, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        //Wrong Answer
                        Toast.makeText(Tutorial.getAppContext(),R.string.wrong, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



      /*  ToggleButton tog = (ToggleButton) view.findViewById(R.id.soundtog);
        tog.setChecked(prefs.checkSound());
        tog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    prefs.setSound(true);

                } else {
                    // The toggle is disabled
                    prefs.setSound(false);

                }
            }*/
//        });


        return rootView;
    }

    public void questionRight()
    {
        questionnum ++;
        // Store new questionnum to Shared Preferences
    }

    public void getNextQuestions()
    {
        // Get new questions from DB Call DB
        // DBHandler.getQuestion(questionnum);

        // public Questions getQuestion(int qu1estionnum){ }

        Questions newquest = new Questions(); // make it equal to the information pulled from the db
        question = newquest;
        ans1.setText(question.getPA1());
        ans2.setText(question.getPA2());
        ans3.setText(question.getPA3());
        ans4.setText(question.getPA4());
    }

}
