package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Write a program to find the mode of a given list of integers. Mode of a
 * number is defined as the number which is most frequently occured. For
 * example: L = {1,2,2,3} // Here mode is 2(most frequently occured) It is
 * possible that multiple answers are possible for a list. In that case print
 * all possible answers in non-increasing order.
 */
public class FindMode
{
    public static void main(String[] args)
    {
        List<Integer> mode = new ArrayList<Integer>();
        int freq = 0;
        List<Integer> list = Arrays.asList(1, 2, 2, 3,3,4);
        for (int i : list)
        {
            if (Collections.frequency(list, i) > freq)
            {
                freq = Collections.frequency(list, i);
                mode.clear();
                mode.add(i);
            }
            else if (Collections.frequency(list, i) == freq && !(mode.contains(i)))
            {
                mode.add(i);
            }
           
        }
        if(mode.size()>1){
        Collections.sort(mode);
        Collections.reverse(mode);
        }
        System.out.println(mode);
    }
}

//lower the time complexity
