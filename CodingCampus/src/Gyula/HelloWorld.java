package Gyula;

public class HelloWorld
{
    public static void main(String[] args)
    {

        System.out.println(PiCalculator());


    }

    public static double PiCalculator()
    {
            double n = 1;
            int counter = 500000;
            double pi = 0;



            for(int x = 0; x<= counter; x++)
            {
                if(x%2==0)
                {
                    pi = pi+ (1/n);
                }
                else
                {
                    pi = pi - (1/n);
                }
                n=n +2;
            }
            pi = pi *4;
            return pi;
    }
}

