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
        
        var c1 = new ChoiceQuestion("what is the capital city of oklahoma", "3");
        c1.addChoice("Norman");
        c1.addChoice("Tulips");
        c1.addChoice("oklahoma city");
        c1.addChoice("Edmond");
        database.add(c1);

        var c2= new ChoiceQuestion("which of the following is not a java keyword", "4");
        c2.addChoice("int");
        c2.addChoice("for");
        c2.addChoice("instanceof");
        c2.addChoice("String");
        database.add(c2);
        

    }
}
