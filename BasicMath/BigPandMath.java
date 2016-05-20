package BasicMath;

/*Big P is fairly good in mathematics.
His teacher has asked him to add two numbers.
Now , Big P has a problem that he sometimes writes a '6' as a '5' and vice versa.
Given two numbers, A and B, calculate the minimum and the maximum sum Big P could possibly get.*/

public class BigPandMath
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int a =11;
        int b=25;
        calculateMinimum(a ,  b);
        calculateMaximum(a,b);
    }
    
    public static void calculateMinimum(int a , int b){
        String s1 = String.valueOf(a);
        s1=s1.replace("6", "5");
        String s2 = String.valueOf(b);
        s2=s2.replace("6", "5");
        int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
        System.out.println(sum);
    }
    
    public static void calculateMaximum(int a , int b){
        String s1 = String.valueOf(a);
        s1=s1.replace("5", "6");
        String s2 = String.valueOf(b);
        s2=s2.replace("5", "6");
        int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
        System.out.println(sum);
    }
}
