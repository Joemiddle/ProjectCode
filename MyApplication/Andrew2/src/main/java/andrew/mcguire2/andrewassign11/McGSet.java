package andrew.mcguire2.andrewassign11;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.annotation.IdRes;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.ToggleButton;

import static android.content.Context.AUDIO_SERVICE;

/**
 * Created by Andrew McGuire
 * N01121995
 * Assignment number 2
 */

public class McGSet extends Fragment {

    int brightness;
    ContentResolver cResolver;
    Window window;

    public McGSet()
    {}

    @TargetApi(Build.VERSION_CODES.M)
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceSate)
    {
        final View view = inflater.inflate(R.layout.mcg_set,container,false);
        //Belongs in Home Fragment

        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(view.getContext());

        boolean blue = sharedPreferences.getBoolean("blue",false);
        boolean yellow = sharedPreferences.getBoolean("yellow",false);
        boolean orange = sharedPreferences.getBoolean("orange",false);

        if(!blue && !yellow && !orange)
        {
         blue = true;
        }

        if(Settings.System.canWrite(view.getContext())) {


            SeekBar seekBar = view.findViewById(R.id.brightness);
            seekBar.setProgress(brightness);


            try {
                Settings.System.putInt(view.getContext().getContentResolver(),
                        Settings.System.SCREEN_BRIGHTNESS_MODE,
                        Settings.System.SCREEN_BRIGHTNESS_MODE_MANUAL);

                brightness = Settings.System.getInt(view.getContext().getContentResolver(),
                        Settings.System.SCREEN_BRIGHTNESS);
            } catch (Settings.SettingNotFoundException e) {
                Log.e("Error", "Cannot access system brightness");
                e.printStackTrace();
            }


            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    //Set the minimal brightness level
                    //if seek bar is 20 or any value below
                    if (progress <= 20) {
                        //Set the brightness to 20
                        brightness = 20;
                    } else //brightness is greater than 20
                    {
                        //Set brightness variable based on the progress bar
                        brightness = progress;
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {


                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                    //Set the system brightness using the brightness variable value

                    Settings.System.putInt(cResolver, Settings.System.SCREEN_BRIGHTNESS, brightness);

                    //Get the current window attributes

                    WindowManager.LayoutParams layoutpars = window.getAttributes();

                    //Set the brightness of this window

                    layoutpars.screenBrightness = brightness / (float) 255;

                    //Apply attribute changes to this window

                    window.setAttributes(layoutpars);

                }
            });
        }
        else
        {

        }

        ToggleButton audiobutton = view.findViewById(R.id.audio);
        final AudioManager audioman = (AudioManager) view.getContext().getSystemService(view.getContext().AUDIO_SERVICE);
        audiobutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                boolean check =  ((ToggleButton)v).isChecked();
                if(check){
                    audioman.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
//                    audioman.setStreamMute(AudioManager.STREAM_NOTIFICATION, true);
//                    audioman.setStreamMute(AudioManager.STREAM_ALARM, true);
//                    audioman.setStreamMute(AudioManager.STREAM_RING, true);
//                    audioman.setStreamMute(AudioManager.STREAM_MUSIC, true);
                }
                else {
                    audioman.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
//                    audioman.setStreamMute(AudioManager.STREAM_SYSTEM, false);
//                    audioman.setStreamMute(AudioManager.STREAM_NOTIFICATION, false);
//                    audioman.setStreamMute(AudioManager.STREAM_ALARM, false);
//                    audioman.setStreamMute(AudioManager.STREAM_RING, false);
//                    audioman.setStreamMute(AudioManager.STREAM_MUSIC, false);
                }
            }
        });




        // Colors
        RadioButton bluebutton = view.findViewById(R.id.blue);
        RadioButton yellowbutton = view.findViewById(R.id.yellow);
        RadioButton orangebutton = view.findViewById(R.id.orange);

        bluebutton.setChecked(blue);
        yellowbutton.setChecked(yellow);
        orangebutton.setChecked(orange);


        final LinearLayout layout = view.findViewById(R.id.settinglayout);

        if(blue){
        layout.setBackgroundColor(getResources().getColor(R.color.blue));
        }
        if(yellow){
        layout.setBackgroundColor(getResources().getColor(R.color.yellow));
        }
        if(orange){
        layout.setBackgroundColor(getResources().getColor(R.color.orange));
        }

        RadioGroup colorGroup = view.findViewById(R.id.color);

        colorGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                switch(i)
                {
                    case R.id.blue:{
                        SharedPreferences sharedPreferences = PreferenceManager
                                .getDefaultSharedPreferences(view.getContext());
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putBoolean("blue", true);
                        editor.putBoolean("orange", false);
                        editor.putBoolean("yellow", false);
                        editor.apply();
                        layout.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;
                    }
                    case R.id.yellow:{
                        SharedPreferences sharedPreferences = PreferenceManager
                                .getDefaultSharedPreferences(view.getContext());
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putBoolean("yellow", true);
                        editor.putBoolean("orange", false);
                        editor.putBoolean("blue", false);
                        editor.apply();
                        layout.setBackgroundColor(getResources().getColor(R.color.yellow));
                        break;
                    }
                    case R.id.orange:{
                        SharedPreferences sharedPreferences = PreferenceManager
                                .getDefaultSharedPreferences(view.getContext());
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putBoolean("orange", true);
                        editor.putBoolean("blue", false);
                        editor.putBoolean("yellow", false);
                        editor.apply();
                        layout.setBackgroundColor(getResources().getColor(R.color.orange));
                        break;
                    }
                }
            }
        });
        return view;
    }
}
