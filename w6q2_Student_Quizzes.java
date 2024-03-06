import java.util.Scanner;

public class w6q2_Student_Quizzes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nam of the student: ");
        String nm = sc.next();

        // making object s here
        Student s = new Student(nm);

        // taking score of the quizes
        System.out.print("Enter the score in quize 1: ");
        double scr1 = sc.nextDouble();
        s.addQuiz(scr1);
        System.out.print("Enter the score in quize 2: ");
        double scr2 = sc.nextDouble();
        s.addQuiz(scr2);
        System.out.print("Enter the score in quize 3: ");
        double scr3 = sc.nextDouble();
        s.addQuiz(scr3);

        // double t_score = s.getTotalScore();
        // System.out.println("The total score of the student: " + t_score);

        // printing detials usinf method
        s.printStudent();

        sc.close();
    }
}

/**
 * Student
 */
class Student {
    String name;
    double totalScore;
    int numberOfQuizzes;

    Student(String name, double score) {
        this.name = name;
        this.totalScore = score;
    }

    Student(double score, String name) {
        this.name = name;
        this.totalScore = score;
    }

    Student(String name) {
        this.name = name;
    }

    String getName(String name) {
        this.name = name;
        return this.name;
    }

    double getAverage() {
        return this.totalScore / this.numberOfQuizzes;
    }

    double getTotalScore() {
        return this.totalScore;
    }

    void addQuiz(double score) {
        this.totalScore = this.totalScore + score;
        this.numberOfQuizzes++;
    }

    void printStudent() {
        System.out.println("Name: " + this.name);
        double avg_scr = getAverage();
        System.out.println("Average score: " + avg_scr);
    }

}