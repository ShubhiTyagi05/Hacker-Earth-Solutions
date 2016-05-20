package BasicMath;

public class MinimumClass
{
    public static void main(String[] args)
    {
       int n=16;
     
       int days=0;
       if(n==1 || n==2){
           days=n;
       }
       else if(n>2){
           int a = 1;
           int b=2;
           int c = 1 - 4*n;
           int underRoot = (int) Math.ceil(Math.pow((b*b-4*a*c),0.5));
           int sol1 = (-b+underRoot)/2;
           int sol2 = (-b-underRoot)/2;
           if(sol1>0 && sol2>0){
               if(sol1>sol2){
                   days=sol2;
               }
               else{
                   days=sol1;
               }
           }
           else if (sol1>0){
               days=sol1;
           }
           else{
               days=sol2;
           }
       }
       System.out.println(days);
    }
}
