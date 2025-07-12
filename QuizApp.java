import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        String[][] questions = {
            {"1. What is the capital of India?", "A. Delhi", "B. Mumbai", "C. Kolkata", "D. Chennai", "A"},
            {"2. What is 2 + 2?", "A. 2", "B. 3", "C. 4", "D. 5", "C"},
            {"3. Who is the father of Java?", "A. Elon Musk", "B. James Gosling", "C. Bill Gates", "D. Mark Zuckerberg", "B"}
        };

        for (String[] q : questions) {
            System.out.println(q[0]);
            System.out.println(q[1]);
            System.out.println(q[2]);
            System.out.println(q[3]);
            System.out.println(q[4]);
            System.out.print("Enter your answer (A/B/C/D): ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(q[5])) {
                score++;
            }
            System.out.println();
        }

        System.out.println("Your final score is: " + score + "/" + questions.length);
    }
}
