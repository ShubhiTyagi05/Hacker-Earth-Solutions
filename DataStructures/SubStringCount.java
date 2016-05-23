package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubStringCount
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] array = new int[4];
        int x = array[3];
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Mainva");
        list.add("Jain");
        list.add("Hatava");
        String sub = "ain";
        findOccurrences(list, sub);
    }

    public static void findOccurrences(List<String> list, String sub)
    {
        int count = 0;
        for (String s : list)
        {
            while (s.contains(sub))
            {
                int index = s.lastIndexOf(sub);
                count++;
                s = s.substring(0, index);
            }
        }
        System.out.println(count);
    }
}
