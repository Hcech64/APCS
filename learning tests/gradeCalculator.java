import java.util.Scanner;

public class  gradeCalculator {
    public static void main (String [] args){

        Scanner keyboard = new Scanner(System.in);

        int concepts = 40;
        int test = 20;
        int quiz = 20;
        int project = 20;

        System.out.println("This program will calculate your APCS grade.");

        // Key Concepts
        System.out.println("what is your grade in the Main Concepts category? ");
        int conceptGrade = keyboard.nextInt();

        // Tests
        System.out.println("what is your grade in the Tests category? ");
        int testGrade = keyboard.nextInt();

        // quiz
        System.out.println("what is your grade in the Main Quiz category? ");
        int quizGrade = keyboard.nextInt();

        // projects
        System.out.println("what is your grade in the projects category? ");
        int projGrade = keyboard.nextInt();

        // total
        int grade = (concepts*conceptGrade + test*testGrade + quiz*quizGrade + project*projGrade)/100;
        System.out.println("your total grade in AP computer science is: " + grade);

        String letterGrade = ("A");

        if (grade > 90){
            letterGrade = ("A");

        if (grade >= 80 && grade <= 89){
            letterGrade = ("B");
        }
        if (grade >= 70 && grade <= 79){
            letterGrade = ("C");
        }
        if (grade >= 60 && grade <= 69){
            letterGrade = ("D");
        }
        if (grade >= 0 && grade <= 59){
            letterGrade = ("F");
        }
        else;
            System.out.println("Error");
        
        }

        System.out.println("Your letter grade is: " + letterGrade);

        keyboard.close();
    }

}

