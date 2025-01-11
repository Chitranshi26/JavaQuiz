package main;

import Service.QuestionService;
import model.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

      //  System.out.println( "Inside Main" );

        QuestionService service  = new QuestionService();
               service.playQuiz();
               service.getScore();
    }
}
