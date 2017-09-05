package org.launchcode;

import java.util.Arrays;

public abstract class Question {
    private int numChoices;
    private String prompt;
    private int[] answer;//note use enum types?

    Question(int numChoices, String prompt, int[] answer) { //note keeping constructors package private it IS a quiz
        this.numChoices = numChoices;
        this.prompt = prompt;
        this.answer = answer;
    }
    Question(int numChoices, String prompt) {
        this.numChoices = numChoices;
        this.prompt = prompt;
        //this.answer = int[] answer;
    }
    Question(String prompt) {
        this.prompt = prompt;
        this.numChoices = 1;
    }
    Question() {

    }

    void setNumChoices(int numChoices) {
        this.numChoices = numChoices;
    }
    public int getNumChoices() {
        return numChoices;
    }


    void setPrompt(String prompt) {
        this.prompt = prompt;
    }
    public String getPrompt() {
        return prompt;
    }

    void setAnswer(int[] answer) {
        this.answer = answer;
    }

    private int[] getAnswer() {
        return answer;
    }

    //note maybe make isCorrect abstract and place responsibility within subclasses?
    boolean isCorrect(int[] someAnswer) {
        return Arrays.equals(someAnswer, answer);
        //return someAnswer == answer;
    }

    //note ditto display
    public String displayQuestion(String question) {
        //question = System.out.print(question.getPrompt());
        return question;
    }
}

