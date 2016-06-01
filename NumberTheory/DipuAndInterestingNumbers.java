package NumberTheory;

public class DipuAndInterestingNumbers
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        long a =1;
        long b=3;
        int count=0;
        for(long j=a; j<=b ; j++){
            if(oddFactors(j)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean oddFactors(long l){
        long count=0;
        for(long i=1 ; i<=l ; i++){
            if(l%i==0){
                count++;
            }
        }
        if(count%2==0){
            return false;
        }
        else{
            return true;
        }
    }
}
