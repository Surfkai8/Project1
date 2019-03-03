package com.example.extstudent.projectoneemily;

public class QuizQuestion {
    private String question;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String correctAnswer;

    // Constructor
    QuizQuestion() {
    }

    protected void setQuestion(String question) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the question class variable.
        /////////////////////////////////////////////////
        this.question= question;
    }

    protected void setChoiceA(String answer) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the first choice class variable.
        /////////////////////////////////////////////////
        this.choiceA= answer;
    }

    protected void setChoiceB(String answer) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the second choice class variable.
        /////////////////////////////////////////////////\
        this.choiceB= answer;
    }

    protected void setChoiceC(String answer) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the third choice class variable.
        /////////////////////////////////////////////////
        this.choiceC= answer;
    }

    protected void setChoiceD(String answerD) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the fourth choice class variable.
        /////////////////////////////////////////////////
        this.choiceD= answerD;
    }

    protected void setCorrectAnswer(String cAnswer) {
        /////////////////////////////////////////////////
        // TO-DO:  Set the correct answer class variable.
        /////////////////////////////////////////////////
        this.correctAnswer = cAnswer;
    }

    protected String getQuestion() {
        /////////////////////////////////////////////////
        // TO-DO: Returns the first answer.
        /////////////////////////////////////////////////
        return this.question;

    }

    protected String getChoiceA() {
        /////////////////////////////////////////////////
        // TO-DO: Returns the first answer.
        /////////////////////////////////////////////////
        return this.choiceA;
    }

    protected String getChoiceB() {
        /////////////////////////////////////////////////
        // TO-DO: Returns the second answer.
        /////////////////////////////////////////////////
        return this.choiceB;
    }

    protected String getChoiceC() {
        /////////////////////////////////////////////////
        // TO-DO: Returns the third answer.
        /////////////////////////////////////////////////
        return this.choiceC;
    }

    protected String getChoiceD() {
        /////////////////////////////////////////////////
        // TO-DO: Returns the fourth answer.
        /////////////////////////////////////////////////
        return this.choiceD;
    }

    protected boolean isCorrectAnswer(String answer) {

        /////////////////////////////////////////////////
        // TO-DO: Compare the passed in answer with the class' correct answer.
        /////////////////////////////////////////////////
        if ( this.correctAnswer.equals(answer) ) {
            return true;
        }
        return false;
    }
}