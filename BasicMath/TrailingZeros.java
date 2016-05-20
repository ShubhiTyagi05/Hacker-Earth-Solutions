package BasicMath;

//Given a number find the number of trailing zeroes in its factorial.


public class TrailingZeros
{
    public static void main(String[] args)
    {
        int n=10;
        int zeros=0;
        if(n<5){
            zeros=0;
        }
        else{
        for(int i=5 ; i<=n ; i=i*5){
            zeros+=findMultiples(n,i);
        }
        }
        System.out.println(zeros);
    }
    
    public static int findMultiples(int num , int fact){
        int n=0;
        for(int i=5 ; i<=num ; i++){
            if(i%fact==0){
                n++;
            }
        }
        return n;
    }
}
