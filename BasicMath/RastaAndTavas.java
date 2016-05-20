package BasicMath;

public class RastaAndTavas
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        long n=20;
        long k=7;
        int count=0;
        if(n==1){
            System.out.println(0);
         }
         else{
          for(long i=2 ; i<=n ; i++){
            if(getResult(i,k)){
                System.out.println("i"+i);
                count++;
            }
          }
          System.out.println(count);
         }  
    }
    
    public static boolean getResult(long n, long k){
        boolean flag=false;
        long sum=0;
        for(long i=2 ; i<=n ; i++){
            if(n%i==0 && isPrime(i)){
                sum+=i;
            }
        }
        if(sum==k){
            flag=true;
        }
        return flag;
    }
    
    public static boolean isPrime(long n){
        boolean flag=true;
        if(n<2){
            flag=false;
        }
        else if(n==2){
            flag=true;
        }
        else{
        for(long i=2 ; i<=Math.ceil(Math.pow(n,0.5)) ; i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        }
        return flag;
    }
}
