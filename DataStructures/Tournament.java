package DataStructures;

/*
 * Lord Paul of the Seven Kingdoms has organized a fighting tournament between
 * all the warriors of the kingdom. He finally gets the match summary of the
 * entire tournament, which states which warrior fought with which warrior. Lord
 * Paul wants you to find out the number of warriors who participated in maximum
 * number of matches. (Which means they survived these many matches!) If there
 * are warriors with equal number of matches, print all of them in
 * lexicographical order (sorted order).
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

class Tournament
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Map<String, Integer> map = new HashMap<String, Integer>();
        int i = 0;
        while ((line = br.readLine()) != null)
        {
            if (i != 0)
            {
                String[] splited = line.split(" ");
                for (String s : splited)
                {
                    if (!map.containsKey(s))
                    {
                        map.put(s, 1);
                    }
                    else
                    {
                        map.put(s, map.get(s) + 1);
                    }
                }
            }
            i++;
        }
        List<String> list = new ArrayList<String>();
        List<Integer> listCount = new ArrayList<Integer>();
        for (int n : map.values())
        {
            listCount.add(n);
        }
        Collections.sort(listCount);
        int max = listCount.get(listCount.size() - 1);
        for (String s : map.keySet())
        {
            if (map.get(s) == max)
            {
                list.add(s);
            }
        }
        if (list.size() > 1)
        {
            Collections.sort(list);
            System.out.println(list.size());
            for (String s : list)
            {
                System.out.println(s);
            }
        }
        else
        {
            System.out.println(1);
            System.out.println(list.get(0));
        }
    }
}

//perfect output :D