package code.project.projectcode;


import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.util.Log;

import java.util.ArrayList;


/**
 * Created by N01121995 on 12/6/2017.
 */

public class MorseToSound {

    MediaPlayer player;

    int soundID[] = {R.raw.dot,R.raw.dash};

    ArrayList<Integer> playlist = new ArrayList<Integer>();


    public void setNextMediaForMediaPlayer(MediaPlayer player, final int audio){
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
               mp = MediaPlayer.create(ProjectActivity.getAppContext(),audio);
                mp.start();
            }
        });
    }

    void play ( final ArrayList<Integer> soundlist ,MediaPlayer player, final int index)
    {
        player = MediaPlayer.create(ProjectActivity.getAppContext(),soundlist.get(index));
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
       public void onCompletion(MediaPlayer mp){

           if(soundlist.size() > index+1) {
               play(soundlist, mp, index + 1);
           }
           mp.release();

        }
    });





    }

     void morseToSound(String morse)  {

         // separate on string letters
        String[] letters = morse.split(" ");

       for(int i = 0; i < letters.length; i++)
       {


           for( int x = 1 ; x < letters[i].length(); x++)
           {
                if (letters[i].charAt(x) == '-' )
                {
                   playlist.add(soundID[1]);
                }

               else if (letters[i].charAt(x) == '.' )
               {
                   playlist.add(soundID[0]);
               }


           }
           play(playlist,player,0);


    }


     }
}
