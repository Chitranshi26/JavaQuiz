package Service;

import model.Question;

import java.util.Scanner;

public class QuestionService {

    Question[] quiz = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){
        quiz[0]= new Question(1,"Size of int in bytes : ","2","4","8","16", "4");
        quiz[1]= new Question(2,"Size of double in bytes : ","2","6","8","16","8");
        quiz[2]= new Question(3,"Size of char in bytes : ","2","6","8","16","2");
        quiz[3]= new Question(4,"Size of long in bytes : ","2","6","8","16","8");
        quiz[4]= new Question(5,"Size of boolean in bytes : ","1","2","8","16","1");
    }

public void playQuiz(){
        int i=0;
for(Question quizX : quiz){
    System.out.println("Question no. : " + quizX.getId());
    System.out.println(quizX.getQuestion());
    System.out.println("a." + quizX.getOption1());
    System.out.println("b." + quizX.getOption2());
    System.out.println("c." + quizX.getOption3());
    System.out.println("d." + quizX.getOption4());
    Scanner sc = new Scanner(System.in);
    System.out.print("Answer: ");
    selection[i] = sc.nextLine();
    i++;
    System.out.println();
}

for(String select : selection)
    System.out.println("Answer selected: "+ select);
}

public void getScore(){
int score = 0;

for(int i=0;i< quiz.length;i++){
    Question quest = quiz[i];
    String actualAns = quest.getAnswer();
    String userAns = selection[i];

    if(actualAns.equals(userAns)){
        score++;
    }
}
    System.out.println("\n" + "Your Score is : " + score);
}

}
