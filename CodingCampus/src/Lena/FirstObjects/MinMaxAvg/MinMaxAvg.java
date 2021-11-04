package Lena.FirstObjects.MinMaxAvg;

public class MinMaxAvg {

    private int[] source;
    private int min=Integer.MAX_VALUE;
    private int max=Integer.MIN_VALUE;
    private double avg=0;


    public MinMaxAvg (int[]source){
        this.source=source;
    }

    public int[] getSource() {
        return source;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getAvg() {
        return avg;
    }

    public double[] getMinMaxAvg() {

        for (int i :source){
            if(i>this.max){
                this.max=i;
            }
            if(i<this.min){
                this.min=i;
            }
            this.avg+=i;
        }
        this.avg=this.avg/this.source.length;
        return new double[]{this.min, this.max, this.avg};
    }

    public String toString() {
        double[] erg = getMinMaxAvg();
        return "Min: " + (int) erg[0] + ", Max: " + (int) erg[1] + ", Avg: " + erg[2];
    }

}
