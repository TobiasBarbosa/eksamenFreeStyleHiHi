package Exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        ExamQuestion exQ1 = new ExamQuestion();
        ExamQuestion exQ2 = new ExamQuestion();
        ExamQuestion exQ3 = new ExamQuestion();
        ExamQuestion exQ4 = new ExamQuestion();
        ExamQuestion exQ5 = new ExamQuestion();
        ExamQuestion exQ6 = new ExamQuestion();
        ExamQuestion exQ7 = new ExamQuestion();
        ExamQuestion exQ8 = new ExamQuestion();
        ExamQuestion exQ9 = new ExamQuestion();
        ExamQuestion exQ10 = new ExamQuestion();
        ExamQuestion exQ11= new ExamQuestion();
        ExamQuestion exQ12 = new ExamQuestion();
        ExamQuestion exQ13 = new ExamQuestion();
        ExamQuestion exQ14 = new ExamQuestion();
        ExamQuestion exQ15 = new ExamQuestion();

        exQ1.addExamQuestion(exQ1);
        exQ1.addExamQuestion(exQ2);
        exQ1.addExamQuestion(exQ3);
        exQ1.addExamQuestion(exQ4);
        exQ1.addExamQuestion(exQ5);
        exQ1.addExamQuestion(exQ6);
        exQ1.addExamQuestion(exQ7);
        exQ1.addExamQuestion(exQ8);
        exQ1.addExamQuestion(exQ9);
        exQ1.addExamQuestion(exQ10);
        exQ1.addExamQuestion(exQ11);
        exQ1.addExamQuestion(exQ12);
        exQ1.addExamQuestion(exQ13);
        exQ1.addExamQuestion(exQ14);
        //exQ1.addExamQuestion(exQ15);

        try {
            File file = new File("questions.txt");
            PrintStream printStream = new PrintStream(file);
            printStream.println(exQ1.getExamQuestionList());
        } catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }

        System.out.println(exQ1);
        System.out.println(exQ1.getExamQuestionList());



    }
}
