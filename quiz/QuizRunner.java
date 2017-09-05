package org.launchcode.quiz;

import java.util.ArrayList;

public class QuizRunner{


    private static ArrayList<Question> populateQuiz() {

        ArrayList<Question> questions = new ArrayList<>();

        MultipleChoice q1 = new MultipleChoice();
        MultipleChoice q2 = new MultipleChoice();
        TorF q3 = new TorF();
        Checkbox q4 = new Checkbox();

        q1.setPrompt("How are you?: \n 1: Good \n 2: Bad \n 3: meh");
        q1.setNumChoices(3);
        q1.setAnswer(new int[] {3});//"meh"//note how to setAnswer to an array of ints, weird syntax
        questions.add(q1);

        q2.setPrompt("How many fingers does Tony Silva have?: \n 1: 7 \n 2: 10 \n 3: who gives a rat's ass \n 4: 10 " +
                "\n 5: 5");
        q2.setNumChoices(5);
        q2.setAnswer(new int[] {1});
        questions.add(q2);

        q3.setPrompt("The previous was tricky because Tony lost his hand to a garage door mishap in '89\n 1: True " +
                "\n 2: False");
        q3.setAnswer(new int[] {2});
        questions.add(q3);

        q4.setPrompt("What were Tony's aunts names? (pick all that apply, seperate answers with spaces only!!)\n 1: Abigail \n 2: Steve \n 3: Florida" +
                "\n 4: Flora \n 5: Silvia \n 6: Antonia");
        q4.setNumChoices(6);
        q4.setAnswer(new int[] {1, 3,4 });
        questions.add(q4);

        return questions;
    }

    public static void main(String[] args) {
        Quiz tonySilvaQuiz = new Quiz();
        //note break up below into seperate steps for readability?
        //System.out.println(tonySilvaQuiz.getGrade(tonySilvaQuiz.giveQuiz(populateQuiz())));
        //System.out.println(tonySilvaQuiz.giveQuiz(populateQuiz()));
        //int score = tonySilvaQuiz.giveQuiz(populateQuiz());
        //System.out.println(tonySilvaQuiz.getGrade(score, populateQuiz()));
        System.out.println(tonySilvaQuiz.getGrade(tonySilvaQuiz.giveQuiz(populateQuiz()), populateQuiz()));
    }
}
