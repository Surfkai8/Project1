package com.example.extstudent.projectoneemily;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {
    private ArrayList<QuizQuestion> quizQuestionList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        initQuestions();
    }


    private void initQuestions() {
        // Create some questions to ask the questions.

        this.quizQuestionList = new ArrayList<QuizQuestion>();  // Initialize our question array.

        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        // TO-DO: Create instances (using the new QuizQuestion()) of your questions.
        // You will have to call into QuizQuestion() setters to set the follow:
        // - The question to ask.
        // - Set choice options for A, B, C, and D.
        // - Set the correct answer (so that class knows which one is correct or not).
        // - Remember to add the object to our quizQuestionList array. Hint: Use .add(...) function here.
        // NOTE: No widgets should be set in this method.
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        QuizQuestion Question1 = new QuizQuestion();
        Question1.setQuestion("What's your favorite color?");

        Question1.setChoiceA("Red");
        Question1.setChoiceB("Black");
        Question1.setChoiceC("Gold");
        Question1.setChoiceD("Blue");

        Question1.setCorrectAnswer("Black");

        quizQuestionList.add(Question1);

        QuizQuestion Question2 = new QuizQuestion();
        Question2.setQuestion("What is 23+39?");

        Question2.setChoiceA(""
        );
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        // TO-DO: Set your currentQuestion to point to your first question here (uncomment out the code below).
        ///////////////////////////////////////////////////////////////////////////////////////////////////////

        //this.currentQuestion = /*Your first question*/;

        // Set the current, score, and total question size.
    }
}
