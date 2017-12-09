package code.project.projectcode;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class FragmentHandler extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static FragmentHandler create(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        FragmentHandler fragment = new FragmentHandler();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view;

        if(mPage == 1) {
            view = inflater.inflate(R.layout.fragment_morse, container, false);

            Button send = (Button) view.findViewById(R.id.send);
            Button dot = (Button) view.findViewById(R.id.dot);
            Button dash = (Button) view.findViewById(R.id.dash);
            Button space = (Button) view.findViewById(R.id.space);
            Button clear = (Button) view.findViewById(R.id.clear);

            clear.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    TextView message = (TextView) view.findViewById(R.id.message);
                    message.setText("");
                }
            });

            dot.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    TextView message = (TextView) view.findViewById(R.id.message);
                    String msg = message.getText().toString();
                    msg = msg + ".";
                    message.setText(msg);

                   MorseToSound sound = new MorseToSound();
                    sound.codeToSound(".");
                }
            });


            dash.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    TextView message = ( TextView)view.findViewById(R.id.message);
                    String msg = message.getText().toString();
                    msg = msg + "-";
                    message.setText(msg);
                    MorseToSound sound = new MorseToSound();
                    sound.codeToSound("-");
                }
            });

            space.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    TextView message = ( TextView)view.findViewById(R.id.message);
                    String msg = message.getText().toString();
                    msg = msg + " ";
                    message.setText(msg);
                }
            });

            //Selected the send message
            send.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {


                    TextView messageText = ( TextView)view.findViewById(R.id.message);
                    TextView conversation = (TextView) view.findViewById(R.id.translation);
                    String message = messageText.getText().toString();


                    message = MorseToText.fromMorse(message);
                    Log.d("d", message);



                    // now needs to display message
                    conversation.setText(message);

//


                }
            });

        }

        else if (mPage == 2)  {
            view = inflater.inflate(R.layout.fragment_text, container, false);


            Button send = (Button) view.findViewById(R.id.send);



            //Selected the send message
            send.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {


                    EditText messageText = (EditText)view.findViewById(R.id.message);

                    String message = messageText.getText().toString();


                        message = TextToMorse.textToMorse(message);




                    // now needs to display message

                    TextView converstaion = (TextView)view.findViewById(R.id.conversation);
                    converstaion.setText(message);



                    MorseToSound sound = new MorseToSound();
                    sound.morseToSound(message);

                }
            });


        }
        else {
            view = inflater.inflate(R.layout.fragment_text,container,false);
        }


        return view;
    }



}