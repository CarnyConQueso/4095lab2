package Controller;

import 4095lab2.app.java.Model.AllQuestions;

public class Score {
    public final int CORRECT_ANSWER = 10;
    public final int SKIP_QUESTION = -5;
    public final int WRONG_ANSWER = 0;
    public int score;

    public Score() {
        score = 0;
    }

    AllQuestions allQs = new AllQuestions();

    public void correctAnswer() {score += CORRECT_ANSWER;}
    public void skipQuestion() {score += SKIP_QUESTION;}
    public void wrongAnswer() {score += WRONG_ANSWER;}

    public int getScore() {return score;}
}
