package DataStructures;

/*
 * Given an array A. Find the highest unique element in array A. Unique element
 * means that element should present only once in the array.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

class UniqueMaximumNumber
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        List<Long> list = new ArrayList<Long>();
        int i = 0;
        while ((line = br.readLine()) != null)
        {
            if (i != 0)
            {
                String[] splited = line.split(" ");
                for (String s : splited)
                {
                    list.add(Long.parseLong(s));
                }
            }
            i++;
        }
        boolean flag = false;
        Collections.sort(list);
        Collections.reverse(list);
        for (long n : list)
        {
            if (Collections.frequency(list, n) == 1)
            {
                System.out.println(n);
                flag = true;
                break;
            }
        }
        if (flag == false)
        {
            System.out.println(-1);
        }
    }
}

//try to reduce time complexity