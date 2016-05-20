package BasicMath;

public class CrazyKanagaroo
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    getCount(7,9,5);
    }
    
    public static void getCount(int a , int b , int m){
        int  count = (int)(b/m)-(int)(a/m);
        System.out.println(count);
    }
}
