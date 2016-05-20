package BasicMath;

//Alice is climbing stairs. There are total N stairs. She climbs A stairs upwards in day and she comes downstairs in night by B stairs. Find number of days she will take to reach the top of staircase.

public class ClimbingStairs
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int n=5;
        double A=n;
        System.out.println(A);
        double B=1;
        double N=6;
        calculateDays(A,B,N);
    }
    public static void calculateDays(double a , double b, double n){
        int days =(int)Math.ceil((n-b)/(a-b));
        System.out.println(days);
    } 
}


//best solution