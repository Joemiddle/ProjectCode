package code.project.projectcode;

/**
 * Created by Andrew McGuire on 02/10/2017.
 */

public class MorseToText {


    public static String fromMorse(String userMessage) {
        String s = userMessage;
        // string with decoded message
        String message = "";

        // sample alphabet string
        String alphabet = "abcdefghijklmnopqrstuvwxyz .";
        String[] morseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--..", " ", ".-.-.-"};

        // separate on string letters
        String[] letters = s.split(" ");

        // iteration morse letters
        for (String morseAlph : letters) {
            char alphabetLetter = ' ';
            int index = -1;
            for (int i = 0; i < morseAlphabet.length; i++) {
                if (morseAlphabet[i].equals(morseAlph))
                    index = i;
            }

            if (index >= 0) // letter found
                alphabetLetter = alphabet.charAt(index);
            message += alphabetLetter;
        }

        return message;
    }

}
