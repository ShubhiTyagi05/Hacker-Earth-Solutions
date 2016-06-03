package SearchingAndSwapping;

/*
 * Our monk, while taking a stroll in the park, stumped upon a polynomial ( A X2
 * + B X +C ) lying on the ground. The polynomial was dying! Being considerate,
 * our monk tried to talk and revive the polynomial. The polynomial said: I have
 * served my purpose, and shall not live anymore. Please fulfill my dying wish.
 * Find me the least non-negative integer Xo, that shall make my value atleast K
 * i.e., A Xo2 + B Xo + C >= K . Help our Monk fulfill the polynomial's dying
 * wish!
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

class MonksEncounterWithPolynomial
{
    public static void main(String args[]) throws Exception
    {
        // Read input from stdin and provide input before running
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int i = 0;
        while ((line = br.readLine()) != null)
        {
            List<Long> list = new ArrayList<Long>();
            if (i != 0)
            {
                String[] splited = line.split(" ");
                for (String s : splited)
                {
                    list.add(Long.parseLong(s));
                    //  int n=Integer.parseInt(s);
                }
                getResult(list);
            }
            i++;
        }
    }

    public static void getResult(List<Long> list)
    {
        long a = list.get(0);
        long b = list.get(1);
        long c = list.get(2) - list.get(3);
        if (c == 0)
        {
            System.out.println(0);
        }
        else
        {
            double root1 = 0.0;
            double root2 = 0.0;
            double root = Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5);
            root1 = (-b + root) / (2 * a);
            root2 = (-b - root) / (2 * a);
            if (root1 > 0 && root2 > 0)
            {
                if (root1 > root2)
                {
                    System.out.println((long) (Math.ceil(root2)));
                }
                else
                {
                    System.out.println((long) (Math.ceil(root1)));
                }
            }
            else if (root1 > 0)
            {
                System.out.println((long) (Math.ceil(root1)));
            }
            else
            {
                System.out.println((long) (Math.ceil(root2)));
            }
        }
    }
}
