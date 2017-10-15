package code.project.projectcode;

/**
 * Created by User on 02/10/2017.
 */

public class TextToMorse {



    public static String textToMorse(String morse)
    {
        String s = morse.toLowerCase();
        String message = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz .";
        String[] morseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--..", " ", ".-.-.-"};

        for (char alphabetLetter : s.toCharArray())
        {
            int index = -1;
            String letter = " ";
            for (int i = 0; i < alphabet.length(); i++)
            {
                if (alphabet.charAt(i) == alphabetLetter)
                {
                    index = i;
                }
            }
            if (index >=0)
            {
                letter = morseAlphabet[index];
            }
            message += letter + " ";
        }
        System.out.printf("Message: %s\n", message);

        return message;
    }
}
