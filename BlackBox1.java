package BasicMath;

/*
 * Paul was the most famous character in Tekken-3. Of course he went to college
 * and stuff. In one of the exams he wasn't able to answer a question which
 * asked to check if a tuple of 3 non negative integers constituted a Primitive
 * Pythagorian Triplet or not. Paul was not able to answer it correctly and
 * henceforth, he could not concentrate on any fight for a very long time and
 * lost most of them. So, he decided to learn everything about Primitive
 * Pythagorian Triplets. Now, Paul seeks your help to determine whether a given
 * triplet is a Primitive Pythagorian Triplet or not. A primitive Pythagorean
 * triple is one in which a, b and c are coprime.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlackBox1
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Integer> list = new ArrayList<Integer>();
        int a = 2;
        int b = 0;
        int c = 2;
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        //System.out.println(areCoPrime(list));
        if (areCoPrime(list) == true && areTriplets(list) == true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

    public static boolean areTriplets(List<Integer> list)
    {
        boolean flag = false;
        if (Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(
                list.get(2), 2))
        {
            flag = true;
        }
        return flag;
    }

    public static boolean areCoPrime(List<Integer> list)
    {
        
        boolean flag = true;
        for (int i = 0; i < list.size() - 1; i++)
        {
            int n = list.get(i);
            if (n == 0)
            {
                continue;
            }
            else
            {
                for (int z = 2; z < Math.pow(n, 0.5); z++)
                {
                    if (n % z == 0)
                    {
                        for (int j = i + 1; j < list.size(); j++)
                        {
                            int k = list.get(j);
                            if (k % z == 0)
                            {
                                flag = false;
                                break;
                            }
                        }
                    }
   
                    if (flag == false)
                    {
                        break;
                    }
                }
            }
        }
        return flag;
    }
}
