package BasicMath;

import java.util.ArrayList;
import java.util.List;

/*
 * Harold always boasted about his prowess with numbers. So one day Reese
 * challenged him to a problem. He gave Harold two numbers X and Y and asked him
 * to find out the Nth number of the series which began with X numbers of Y’s
 * and the following elements are equal to the sum of the last X numbers in the
 * series. Help Harold find the Nth number of the series.
 */
public class NumbersOfInterest
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int x = 3;
        int y = 0;
        int n = 7;
        if(y==0){
            System.out.println(0);
        }
        else{
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < x; i++)
        {
            list.add(y);
        }
        while (list.size() <n)
        {
            int sum = 0;
            for (int i = list.size() - 1; i > list.size() - 4; i--)
            {
                sum += list.get(i);
            }
            list.add(sum);
        }
        System.out.println(list.get(list.size()-1));
    }
    }
}

//correct for sample output , incorrect for test