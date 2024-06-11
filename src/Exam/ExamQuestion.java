package Exam;

import java.util.ArrayList;
import java.util.Random;

public class ExamQuestion {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private int number;
    private char grade;
    private Random random = new Random();
    private static int nextNumber = 1;
    private ArrayList<ExamQuestion> examQuestionList = new ArrayList<>();

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public ExamQuestion(){
        number = nextNumber++;
        grade = randomizeGrade();
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public char randomizeGrade(){
        char[] gradeList = {'A', 'B', 'C', 'D', 'E', 'F'};
        int randomIndex = random.nextInt(gradeList.length);
        return gradeList[randomIndex];
    }

    public void addExamQuestion(ExamQuestion eq){
        if(examQuestionList.size() < 14) {
            examQuestionList.add(eq);
        } else {
            throw new IllegalArgumentException("There can only be 14 exam questions");
        }
    }

    public ArrayList<ExamQuestion> getExamQuestionList(){
        return examQuestionList;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return "Exam Question\n" +
                "Number: " + number + '\n' +
                "Grade: "  + grade  + '\n' ;
    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
