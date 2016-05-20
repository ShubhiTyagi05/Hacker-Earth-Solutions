package BasicMath;

import java.util.ArrayList;
import java.util.List;

public class DivideArray
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List <Integer> list = new ArrayList<Integer>();
        list.add(50);
        list.add(20);
        list.add(18);
        list.add(27);
        list.add(19);
        List <Integer> dList = new ArrayList<Integer>();
        dList.add(2);
        dList.add(3);
        dList.add(2);
        getList(list,dList);
    }
    
    public static void getList(List<Integer> list , List<Integer> dList){
        for(int i : list){
          for(int d : dList){
              if(d!=0){
              i=i/d;
              }
          }
          System.out.print(i+" ");
        } 
      
      }
}
