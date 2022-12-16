package Basics;

// Practising datatypes, variables, conditions and functions in java

// A program to get students marks for 4 units and return the mean Grade

import java.util.Scanner;

public class Marks {

    static double getMean(int a, int b, int c, int d) {
        double mean = (a + b + c + d) / 4;
        return mean;
    }

    static String findGrade(double score) {
        if (score > 100 || score < 0) {
            return "Invalid Score";
        } else if (score >= 70) {
            return "Grade A";
        } else if (score >= 60) {
            return "Grade B";
        } else if (score >= 50) {
            return "Grade C";
        } else if (score >= 40) {
            return "Grade D";
        } else {
            return "Fail";
        }

    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a score for unit 1: ");
            int unit1 = in.nextInt();

            System.out.println("Enter a score for unit 2: ");
            int unit2 = in.nextInt();

            System.out.println("Enter a score for unit 3: ");
            int unit3 = in.nextInt();

            System.out.println("Enter a score for unit 4: ");
            int unit4 = in.nextInt();

            double mean = getMean(unit1, unit2, unit3, unit4);

            String grade = findGrade(mean);

            System.out.println("Your mean score is " + mean + " and your grade is " + grade);
        }

    }
}
