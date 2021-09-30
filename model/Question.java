package model;

public class Question{

    String text;
    String answer;

    public Question(String text,String answer){
      this.text=text;
      this.answer=answer;
    }

    public boolean checkAnswer(String response){
        return response.equalsIgnoreCase(answer);
    }

    public void display(){
        System.out.println(text);
    }
}
