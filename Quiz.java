package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private int score;

    Scanner scanner = new Scanner(System.in);

    public Quiz(ArrayList<Question> questions, int score) {
        this.questions = questions;
        this.score = score;
    }

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    Quiz() {

    }


    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    private int[] getSomeAnswer() {
        int[] mistake = new int[0];
        try {
            Scanner scanner = new Scanner(System.in);
            int[] answerInts = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            return answerInts;
        } catch (NumberFormatException e) {
            System.out.println("answers must only contain integers");
        }
        return mistake;
    }


    int giveQuiz(ArrayList<Question> questions) {
        for (Question question : questions) {
            //question.displayQuestion(question.getPrompt());
            System.out.println(question.getPrompt());
            if (question.isCorrect(getSomeAnswer())) {
                try {
                    Thread.sleep(1000);//note pauses for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Nice");
                score++;
            } else {
               // Thread.sleep(1000);//note didn't see the need to wait
                System.out.println("WRONG!");
                //question.getPrompt();
            }
        }
            return score;
    }

//    public enum letGrades{
//        A, B, C, D, E, F
//    }

    String getGrade(int score, ArrayList<Question> questions) {
        //note user enum/swithc?// doesn't seem possible with booleans ie case(grade > .9)
        //String grade = new String();
        double grade = (float)score / questions.size();//note when dividing two int to produce float must cast one int to float
        String letGrade = new String();
        if (grade > 1) {
            System.out.println("Cheater!!");
        } else if (grade > .9 && grade < 1) {
            letGrade = "A";
        } else if (grade >.8 && grade < .9) {
            letGrade = "B";
        } else if (grade > .7 && grade < .8) {
            letGrade = "C";
        } else if (grade > .6 && grade < .7) {
            letGrade = "D";
        } else {
            letGrade = "F for utter Failure!!";
        }
        return "You got a(n) " + letGrade + " with " + Double.toString(100 * grade) +"%";

    }

}
