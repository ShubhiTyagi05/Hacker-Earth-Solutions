package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class MarutAndGirls
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        int search = 2;
        binarySearch(list,search);
    }
    public static void binarySearch(List<Integer> list, int search){
        int beg=0;
        int end = list.size()-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(search==list.get(mid)){
                System.out.println("Found");
                break;
            }
            else if(search<list.get(mid)){
                end=mid-1;
            }
            else{
                beg=mid+1;
            }
        }
    }
}
