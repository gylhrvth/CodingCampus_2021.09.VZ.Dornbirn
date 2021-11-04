package Rauan.woche8;

public class miniMaxAvg {
    private  int min;
    private  int max;
    private double avg;

    public miniMaxAvg (int min, int max, double avg){
        this.min=min;
        this.max=max;
        this.avg=avg;
    }

    public int getMin() {return min;}

    public int getMax() {return max;}

    public double getAvg() {return avg;}

    public String tostring (){return  String.format("Minvalue %d Maxvalue %d Avg %.2f" , min,max,avg);}
}
