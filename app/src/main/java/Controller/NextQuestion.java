package Controller;

public class NextQuestion {

    private static int index = 0;

    public int getCurrentQuestion() {
        return index;
    }

    public int getNextQuestionsIndex() {
        index += 1;
        return index;
    }
}
