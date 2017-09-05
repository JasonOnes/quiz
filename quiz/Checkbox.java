package org.launchcode.quiz;

public class Checkbox extends Question {
    private int numPicks;
    private int[] answer;

    public Checkbox(int numChoices, String prompt, int[] answer, int numPicks) {
        super(numChoices, prompt);
        this.numPicks = numChoices;
        this.answer = answer;
    }
    public Checkbox(int numChoices, String prompt) {
        super();
        this.numPicks = numChoices;
    }
    public Checkbox(int numChoices) {
        super();
        this.numPicks = numChoices;
    }


    Checkbox() {

    }

//    @Override
//    void setAnswer(int[] answer) {
//        this.answer = answer;
//    }
}
