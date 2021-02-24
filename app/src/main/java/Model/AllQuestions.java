package Model;
import com.example.a4095lab2.R;

public class AllQuestions {
    private int questionIndex;

    private Question[] allQuestions = {
            new Question(R.string.q_start, true),
            new Question(R.string.q_seas, true),
            new Question(R.string.q_continent, true),
            new Question(R.string.q_add3_4, true),
            new Question(R.string.q_add5_4, true),
            new Question(R.string.q_world, true),
            new Question(R.string.q_add2_2, true),
            new Question(R.string.q_earth, true),
            new Question(R.string.q_rainbow, true),
            new Question(R.string.q_multiply3_6, true),
            new Question(R.string.q_start, true),
    };

    public AllQuestions() {
        questionIndex = 0;
    }

    public Question getQuestions (int index) {
        index = index % allQuestions.length;
        return allQuestions[index];
    }
}
