public class w6q2_Student_Quizzes {

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
    }

    void printStudent() {
        System.out.println("Name: " + this.name);
        double avg_scr = getAverage();
        System.out.println("Aveergae score: " + avg_scr);
    }

}