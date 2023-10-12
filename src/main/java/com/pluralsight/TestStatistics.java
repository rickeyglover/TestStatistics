package com.pluralsight;
import java.util.Arrays;
public class TestStatistics {
    public static void main(String[] args) {
        int total = 0;
        int[] testScores = {98, 79, 84, 89, 95, 83, 76, 88, 92, 100};
        Arrays.sort(testScores);
        System.out.println(testScores);

        for (int i = 0; i < testScores.length; i++) {
            System.out.println(testScores[i] + "");
            total += testScores[i];
        }
        System.out.print("\n");
        int average = total / testScores.length;
        System.out.println("Average: " + average);
        int highestScore = testScores[testScores.length - 1];
        System.out.println("Highest Score: " + highestScore);
        int lowestScore = testScores[0];
        System.out.println("Lowest Score: " + lowestScore);
    }
}
