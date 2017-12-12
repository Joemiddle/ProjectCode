package com.example.tutorial;

public class Questions {

    private String Question [][] = {
            {"How do you represent SOS?"},
            {"How do you represent the letter R?"},
            {"How do you represent the letter A?"},
    };

    private String Options[][] = {
            {"...---...", "---...---", "..----..-", "--.-.---."},
            {"-.", "--", ".-.", "--."},
            {"-.", "--", ".-", "--"},
    };

    private String Answers[] = {"...---...", ".-.", ".-"};


    public String[] Retrieve(int x){
        String[] question = Question[x];
        return question;
    }
}
