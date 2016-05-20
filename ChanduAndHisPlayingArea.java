package BasicMath;

/*
 * Little chandu is very fond of playing games. Recently, He found a few straws
 * each of length 1 inches in the store room. He took all of them and decided to
 * mark a rectangular area on the floor with straws and warn rest of the family
 * members to not to enter that area so that he can play in peace. He wants to
 * maximize that area. But, unable to do so, He seeks for your help. You being
 * the elder brother of chandu, write a program for him to find maximum area
 * that he can cover in inches using N straws.
 */
public class ChanduAndHisPlayingArea
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int n = 11;
        if(n<4){
            System.out.println("0");
        }
        else{
        findMaxArea((double) n);
        }
    }

    public static void findMaxArea(double n)
    {
        double a = 0;
        double b = 0;
        a = Math.floor(n / 4);
        b = Math.floor(n / 2 - a);
        int maxArea = (int) Math.floor(a * b);
        if (2 * (a + b) < n)
        {
            int c = ((int) a) + 1;
            if (2 * (b + c) <= n)
            {
                a = c;
             //   maxArea = (int) Math.floor(a * b);
            }
        }
        System.out.println(maxArea+" "+a+" "+b );
    }
}

//partially solved