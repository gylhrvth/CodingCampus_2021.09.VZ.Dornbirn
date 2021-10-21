package Lena;

import java.util.Arrays;
import java.util.Scanner;

public class SmartQuantity {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // startSmartQuantity();
        float[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 10};
        float[] values2 = {1.282f, 1.960f, 0.126f, 1.341f, 2.054f, 0.253f, 1.405f, 2.326f, 0.385f, 1.476f, 2.576f, 0.524f, 1.555f, 3.090f, 0.674f, 1.645f, 3.719f, 0.842f, 1.751f, 4.265f, 1.036f, 1.881f};

        float[] values3 = {1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9, 9, 10, 10};
        float[] values4 = {1, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 8, 9, 30};

        printDistribution(values, 30);
        printDistribution(values2, 6);
        printDistribution(values3, 10);
        printDistribution(values4, 30);

    }

    public static void startSmartQuantity() {
        int participants = askNumberOfParticipants();
        float[] estimates = askForEstimate(participants);
        float result = calculateAverage(estimates);

        System.out.println(result);

    }

    public static int askNumberOfParticipants() {
        System.out.println("Wie viele Teilnehmer werden am Experiment teilnehmen?");

        return s.nextInt();
    }

    public static float[] askForEstimate(int participants) {

        float[] estimates = new float[participants];

        for (int i = 0; i < estimates.length; i++) {
            System.out.println("Was schätzen Sie?");
            estimates[i] = s.nextInt();

        }

        return estimates;
    }

    public static float calculateAverage(float[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public static void printDistribution(float[] estimates, int graphicalIndex) {
        float[] convertedEstimates = convertEstimateArrayToScale(estimates, graphicalIndex);
        String[][] distributionTable = new String[estimates.length][graphicalIndex];

        fillDistributionTabel(convertedEstimates, distributionTable);


        for (int i = 0; i < distributionTable.length; i++) {
            String[] row = distributionTable[i];
            for (int j = 0; j < graphicalIndex; j++) {
                if (row[j] != null) {
                    System.out.print(row[j]);
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void fillDistributionTabel(float[] convertetEstimates, String[][] distributionTable) {


        for (int i = 0; i < convertetEstimates.length; i++) {
            boolean insertCheck = false;
            int row = 0;
            while (!insertCheck) {
                int convertedEstimate = (int)convertetEstimates[i];
                if (distributionTable[row][convertedEstimate] == null) {
                    distributionTable[row][convertedEstimate] = "X";
                    insertCheck = true;
                } else if (row < distributionTable.length) {
                    row++;
                }
            }
        }
    }

    public static float getHighestEstimate(float[] estimates) {
        float lowest = Float.MIN_VALUE;

        for (int i = 0; i < estimates.length; i++) {
            if (estimates[i] > lowest) {
                lowest = estimates[i];
            }

        }
        return lowest;
    }

    public static float getLowestEstimate(float[] estimates) {
        float lowest = Float.MAX_VALUE;

        for (int i = 0; i < estimates.length; i++) {
            if (estimates[i] < lowest) {
                lowest = estimates[i];
            }

        }
        return lowest;
    }

    public static float[] convertEstimateArrayToScale(float[] estimates, float graphicalIndex) {
        float[] convertetEstimates = new float[estimates.length];
        final float GRAPHICAL_INDEX = graphicalIndex-1;
        float highestEstimate = getHighestEstimate(estimates);
        float lowestEstimate = getLowestEstimate(estimates);
        float scaleIndex = (highestEstimate - lowestEstimate) / GRAPHICAL_INDEX;

        for (int i = 0; i < estimates.length; i++) {
            convertetEstimates[i] = (estimates[i] - lowestEstimate) / scaleIndex;
        }

        return convertetEstimates;
    }

}
