import java.util.Scanner;


//according to question class name should be 'demo'
public class w6q1_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        double marks = sc.nextDouble();

        // checking if the number is between 0 to 100
        if (marks < 0 || marks > 100) {

            System.out.println("Invalid! The marks should be between 0 to 100");

            sc.close();
            return;
        } else {

            // creating object 'gr' of Grader
            Grader gr = new Grader(marks);

            String grad = gr.letterGrade();
            System.out.println("The grade for the corresponding number is " + grad);
        }
        sc.close();
    }
}

class Grader {
    double score;

    Grader(double g) {
        this.score = g;
    }

    String letterGrade() {

        // assigning grade for the marks
        if (this.score < 50) {
            return "F";
        } else if (this.score >= 50 && this.score < 55) {
            return "D";
        } else if (this.score >= 55 && this.score < 60) {
            return "D+";
        } else if (this.score >= 60 && this.score < 65) {
            return "C";
        } else if (this.score >= 65 && this.score < 75) {
            return "C+";
        } else if (this.score >= 75 && this.score < 80) {
            return "B";
        } else if (this.score >= 80 && this.score < 85) {
            return "B+";
        } else if (this.score >= 85 && this.score < 90) {
            return "A";
        } else if (this.score >= 90 && this.score <= 100) {
            return "A+";
        }

        return " ";
    }
}