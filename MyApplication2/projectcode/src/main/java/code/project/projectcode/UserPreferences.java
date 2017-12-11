package code.project.projectcode;

import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;

/**
 * Created by Andrew on 10/12/2017.
 */

public class UserPreferences {

    private boolean french;
    private boolean sound;

     private UserPreferences()
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProjectActivity.getAppContext());
        french = prefs.getBoolean("French",false);
        sound = prefs.getBoolean("Sound",true);
    }

    private void setFrench(boolean fre)
    {
        SharedPreferences prefs  = PreferenceManager.getDefaultSharedPreferences(ProjectActivity.getAppContext());
        SharedPreferences.Editor edit = prefs.edit();
        edit.putBoolean("French",fre);
        edit.apply();
        this.french = fre;
    }

    private void setSound(boolean vol)
    {
        SharedPreferences prefs  = PreferenceManager.getDefaultSharedPreferences(ProjectActivity.getAppContext());
        SharedPreferences.Editor edit = prefs.edit();
        edit.putBoolean("Sound",vol);
        edit.apply();
        this.sound = vol;
    }

    private boolean checkSound()
    {
        return sound;
    }
    private boolean checkFrench()
    {
        return french;
    }


}
