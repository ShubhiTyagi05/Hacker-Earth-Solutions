package BasicMath;

import java.util.ArrayList;
import java.util.List;

/*
 * In this problem of Googly sum nikki gives you a sequence A consisting of N
 * integers. nikki will call the ith sequence element good if it equals to the
 * sum of some three elements in positions strictly smaller than i . Now nikki
 * asks you a simple question how many good elements does the sequence contain?
 * Note : An element can be used more than once in the sum i.e lets say sequence
 * is [1 3 5 9] (indexing from 0) consider the following points - 1) In sequence
 * 1 is not good obviously. 2) 3 is good as 1 can be added three times to get 3
 * 3) 5 is good as adding two times 1 and one time 3 will give 5 4) 9 is good as
 * 1+3+5=9 and also adding element 3 three times will give 9 so any of these
 * condition can be used to count 9 as good.
 */
public class GooglySum
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        //list.add(2);
        list.add(3);
        list.add(5);
       // list.add(7);
        list.add(9);
       // list.add(10);
        int good = 0;
        for (int i = 1; i < list.size(); i++)
        {
            int n = list.get(i);
            boolean isGood=false;
            for(int j=0 ; j<i ; j++){
                int k = list.get(j);
                if(n%k==0 && n/k==3){
                    isGood=true;
                    good++;
                    break;
                }
                else if(isGood==false && i>1){
                    isGood=ifSimpleSum(i,list);
                 }
                
                else if(i>1){
                    for(int l=j+1 ; l<i ; l++){
                        int m = list.get(l);
                        if(2*m+k==n){
                            isGood=true;
                            good++;
                            break;
                        }
                        else if (2*k+m==n){
                            isGood=true;
                            good++;
                            break;
                        }
                    }
                }
                
            }
            
        }
        System.out.println(good);
    }
    
    public static boolean ifSimpleSum(int i , List<Integer> list){
        boolean isGood=false;
        int n=list.get(i);
        int sum=0;
        int count=0;
        for(int j=0 ; j<i ; j++){
            sum+=list.get(j);
            count++;
            //if(sum){}
        }
        return isGood;
    }
}
