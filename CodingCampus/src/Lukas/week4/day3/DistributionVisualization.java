package Lukas.week4.day3;

public class DistributionVisualization {
    public static void main(String[] args) {
        float[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 10};
        float[] values2 = {1.282f, 1.960f, 0.126f, 1.341f, 2.054f, 0.253f, 1.405f, 2.326f, 0.385f, 1.476f, 2.576f, 0.524f, 1.555f, 3.090f, 0.674f, 1.645f, 3.719f, 0.842f, 1.751f, 4.265f, 1.036f, 1.881f};

        float[] values3 = {1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9, 9, 10, 10};
        float[] values4 = {1, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 8, 9, 30};

        printDistribution(values, 30);
        printDistribution(values2, 6);
        printDistribution(values3, 10);
        printDistribution(values4, 30);
    }

    private static void printDistribution(float[] values, int displayWidth) {

    }
}
