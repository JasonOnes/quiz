package org.launchcode;

public class Essay extends Question {

    public Essay(int numChoices, String prompt, String answer) {
        super(numChoices=0, prompt);
    }


    private String displayAnswer(String someAnswer) {
        //note textfield ?
        return "    ";
    }


//    @Override
//    boolean isCorrect(String someAnswer) {
//        //note not sure how to compare text field string to null maybe set @validation ? to check for length to start
//        return true;
//    }
}
