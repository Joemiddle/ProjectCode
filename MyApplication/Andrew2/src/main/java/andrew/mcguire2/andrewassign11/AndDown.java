package andrew.mcguire2.andrewassign11;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


/**
 * Created by Andrew McGuire
 * N01121995
 * Assignment number 2
 */


public class AndDown extends Fragment {

    View view;
    ProgressBar progress;
    URL url;

    public AndDown()
    {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceSate)
    {
        view = inflater.inflate(R.layout.and_down,container,false);
        //Belongs in Home Fragment

        Button downButton = view.findViewById(R.id.download);


        progress = (ProgressBar) view.findViewById(R.id.progress);

        ImageView image = (ImageView)view.findViewById(R.id.downimage);
        try {
            url  = new URL("https://picsum.photos/200/300/?random");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            TextView textView = (TextView) view.findViewById(R.id.nameandid);
            textView.setText("Failed to get the URl");
        }

        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                DownloadFilesTask dw = new DownloadFilesTask();
                dw.execute(url);

            }
        });

        return view;
    }

    private class DownloadFilesTask extends AsyncTask<URL, Integer, Long> {

        @Override
        protected Long doInBackground(URL... urls) {
            int count = urls.length;

            long totalSize = 0;
            for (int i = 0; i < count; i++) {
                totalSize += DownloadFile(urls[i]);
                publishProgress((int) ((i / (float) count) * 100));
                // Escape early if cancel() is called
                if (isCancelled()) break;
            }
            return totalSize;
        }

        private long DownloadFile(URL url) {
            // TODO Auto-generated method stub
            int total = 0;
            try {

                URLConnection conn = url.openConnection();
                if (!(conn instanceof HttpURLConnection))
                    throw new IOException("Not an HTTP connection");

                HttpURLConnection httpConn  = (HttpURLConnection) conn;

                //httpConn.setAllowUserInteraction(false);
                //httpConn.setInstanceFollowRedirects(true);
                httpConn.setRequestMethod("GET");
                httpConn.connect();

                int response = httpConn.getResponseCode();
                if (response == HttpURLConnection.HTTP_OK) {
                    InputStream input = httpConn.getInputStream();

                    // download the file
                    // each portion will stored into an index
                    String[] path = url.getPath().split("/");
                    // we are interested only in the last index
                    String imageName = path[path.length - 1];
                    String PATH = "/DownLoad/" ;
                    File folder = new File(PATH);
                    folder.mkdirs();
                    String fileName = imageName;
                    OutputStream output = new FileOutputStream(folder+"/"+fileName);

                    byte data[] = new byte[1024];

                    int count;
                    while ((count = input.read(data)) != -1) {
                        total += count;
                        output.write(data, 0, count);
                    }
                    output.flush();
                    output.close();
                    input.close();

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            return total;
        }

        protected void onPostExecute(Long result) {
            Toast.makeText(view.getContext(), "Downloaded " + result + " bytes", Toast.LENGTH_LONG).show();
        }

        protected void onProgressUpdate(Integer... values) {
            Log.d("MyAsyncTask","onProgressUpdate - " + values[0]);
            int i = values.length;
            int k = 0;

            for (int ii = 0; ii< i;ii++){
                k= k+ values[ii];
            }

            progress.setProgress(k);

            if(k >= 100)
            {
                TextView complete = (TextView) view.findViewById(R.id.downstatus);
                complete.setText(R.string.downloadcomplete);
            }
        }

    }
}


