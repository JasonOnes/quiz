package org.launchcode;

class MultipleChoice extends Question {
    private int numPicks;

    MultipleChoice(int numChoices, String prompt, int[] answer, int numPicks) {//note constructors package private
        super(numChoices, prompt, answer);
        this.numPicks = 1;
    }
    MultipleChoice() {

    }
}
