package andrew.mcguire2.andrewassign11;

import android.location.Geocoder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/**
 * Created by Andrew McGuire
 * N01121995
 * Assignment number 2
 */

public class McWeb extends Fragment {

    public McWeb() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceSate) {
        final View view = inflater.inflate(R.layout.mc_web, container, false);
        //Belongs in Home Fragment

        Button webservice = (Button) view.findViewById(R.id.WebService);
        final EditText zipnum = (EditText) view.findViewById(R.id.zip);

        webservice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String zip = zipnum.getText().toString();

                if (!zip.isEmpty() && zip.length() == 5) {

                    new Thread() {
                        @Override
                        public void run() {

                            String zip = zipnum.getText().toString();
                            String textSource = "http://www.webservicex.net/uszip.asmx/GetInfoByZIP?USZip=";
                            URL textUrl;
                            TextView city = (TextView) view.findViewById(R.id.city);
                            TextView address = (TextView) view.findViewById(R.id.area);

                            try
                            {
                                // URL untested
                                textUrl = new URL(textSource + zip);
                                BufferedReader bufferReader = new BufferedReader(new InputStreamReader(textUrl.openStream()));
                                String StringBuffer;
                                String stringText = "";

                                while ((StringBuffer = bufferReader.readLine()) != null) {
                                    stringText += StringBuffer;
                                }
                                bufferReader.close();

                                city.setText(stringText);
                            } catch (MalformedURLException e)
                            {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                                city.setText(e.toString());
                            } catch (Exception e)
                            {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                                city.setText(e.toString());
                            }
                            address.setText(R.string.finish);
                        }
                    };
                } else {
                    TextView city = (TextView) view.findViewById(R.id.city);
                    city.setText(R.string.noinfo);
                }
            }
        });
        return view;
    }


}
