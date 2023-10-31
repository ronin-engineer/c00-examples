package $04.function;

import java.util.Scanner;

public class $1_Void {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        do {
            System.out.println("Enter score: ");
            score = scanner.nextInt();
            System.out.println("Score: " + score + " in word: ");
            printGrade(score);
        } while (score != 0);
    }

    public static void printGrade(int score) {
        if (score < 0 || score > 10) {
            System.out.println("Invalid score");
            return;
        }

        if (score > 9) {
            System.out.println("A+");
        }
        else if (score > 8) {
            System.out.println("A");
        }
        else if (score > 7) {
            System.out.println("B");
        }
        else if (score > 6) {
            System.out.println("C");
        }
        else if (score > 4) {
            System.out.println("D");
        }
        else
            System.out.println("F");
    }
}
