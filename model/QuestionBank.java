package model;

import java.util.ArrayList;


public class QuestionBank {
    

    public static final ArrayList<Question> database = new ArrayList<>();

    static{
        database.add(new Question(
             "who is the inventor oj java?",
             "James Gosling"
        ));
        database.add(new Question("In what city is UCO located", "Edmond"));


    }
}
