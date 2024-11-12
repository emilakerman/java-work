/* 
 * Modul 5
 * Problem53.java
 * Emil Åkerman
 * 2024-10-25
*/

import java.util.Arrays;

public class Problem53 {
    public static void main(String[] args) {
        double[] doubleArray5 = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
        double[] doubleArrayNew = new double[] { 2.0, 4.0, 4.0, 4.0, 5.0 };
        avg(doubleArrayNew);
        median(doubleArrayNew);
        stdDev(doubleArrayNew);
    }

    public static double stdDev(double[] values) {
        double[] data = values.clone();
        double[] differences = new double[values.length];
        double mean = avg(data);
        double[] differencesSquared = new double[values.length];
        // Find the differences
        for (int i = 0; i < values.length; i++) {
            differences[i] = (values[i] - mean);
        }
        // Differences Squared
        differencesSquared = squared(differences).clone();
        // Variance
        double sum = 0.0;
        sum += sum(differencesSquared);
        double variance = sum / differencesSquared.length;
        // Return Standard Deviation
        double standardDeviation = Math.sqrt(variance);
        System.out.println("Standard deviation: " + standardDeviation);
        return standardDeviation;
    }

    public static double[] squared(double[] values) {
        double[] squaredValues = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            squaredValues[i] = values[i] * values[i];
        }
        return squaredValues;
    }

    public static double sum(double[] values) {
        double sum = 0.0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static double avg(double[] values) {
        double sum = 0.0;
        for (int i = 0; i <= values.length - 1; i++) {
            sum = sum += values[i];
        }
        System.out.println("Average: " + sum / values.length);
        return sum / values.length;
    }

    public static double median(double[] values) {
        double[] data = values.clone();
        double median;
        Arrays.sort(data);
        if (data.length % 2 == 0) {
            int middle1 = data.length / 2 - 1;
            int middle2 = data.length / 2;
            median = (data[middle1] + data[middle2]) / 2.0;
            System.out.println("Even numbers, median: " + median);
        } else {
            int middle = data.length / 2;
            median = data[middle];
            System.out.println("Even numbers, median: " + median);
        }
        return median;
    }
}