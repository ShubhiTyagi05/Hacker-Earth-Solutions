package BasicMath;

/*
 * Panda loves solving problems which are deemed impossible by his fellow
 * classmates. The current problem which he is working on is to express a number
 * N as sum of powers of number X (Not necessarily distinct) such that the
 * number of powers of number X used should be minimum. Note: The powers of a
 * number can be 0, 1, 2, 3, 4, ...
 */
public class PandaAndCombination
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int m = 110;
        int n = 10;
        long count = 0;
        int power = 0;
        if (n != 1)
        {
            power = findHighestPower(m, n);
            count++;
            double sum = Math.pow(n, power);
            if ((m - sum) < n)
            {
                while (sum != m)
                {
                    sum += 1;
                    count++;
                }
            }
            else
            {
                for (int i = power-1; i >= 0; i--)
                {
                    while(sum+Math.pow(n, i)<=m){
                        sum+=Math.pow(n,i);
                        count++;
                    }
                }
            }
        }
        else
        {
            count = m;
        }
        System.out.println(count);
    }

    public static int findHighestPower(int m, int n)
    {
        int i = 0;
        while (Math.pow(n, i) <= m)
        {
            i++;
        }
        return i - 1;
    }
}
