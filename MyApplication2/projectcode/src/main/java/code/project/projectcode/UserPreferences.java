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

     public UserPreferences()
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProjectActivity.getAppContext());
        french = prefs.getBoolean("French",false);
        sound = prefs.getBoolean("Sound",true);
    }

    public void setFrench(boolean fre)
    {
        SharedPreferences prefs  = PreferenceManager.getDefaultSharedPreferences(ProjectActivity.getAppContext());
        SharedPreferences.Editor edit = prefs.edit();
        edit.putBoolean("French",fre);
        edit.apply();
        this.french = fre;
    }

    public void setSound(boolean vol)
    {
        SharedPreferences prefs  = PreferenceManager.getDefaultSharedPreferences(ProjectActivity.getAppContext());
        SharedPreferences.Editor edit = prefs.edit();
        edit.putBoolean("Sound",vol);
        edit.apply();
        this.sound = vol;
    }

    public boolean checkSound()
    {
        return sound;
    }
    public boolean checkFrench()
    {
        return french;
    }


}
