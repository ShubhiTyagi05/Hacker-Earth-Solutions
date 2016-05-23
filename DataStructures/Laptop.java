package DataStructures;

//Bob and Khatki recently started a business. They sell computers at moderate rates. To grow their business they need to know which company’s laptops are in demand. You are given description of N laptops which are sold out. Each laptop is described by their company name. Can you help them figure out which company’s laptops are in demand. The company in demand is the one whose laptops are being sold more. If there are multiple such companies print the one which is lexicographically smallest.

import java.io.*;
import java.util.*;


class Laptop {
   public static void main(String args[] ) throws Exception {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String line ;
        Map<String,Integer> map = new HashMap<String,Integer>();
        while( (line = br.readLine()) != null) {
           if(!(map.containsKey(line))){
               map.put(line,1);
               }
           else{
               int val=map.get(line);
               map.put(line,val+1);
           }
       }
        List<Integer> s = (List<Integer>) map.values();
        Collections.sort(s);
        findPopular(map);  
       }
       
   public static void findPopular(Map<String,Integer> map){
       String result = new String();
       int val=0;
       List<Integer> s = new ArrayList<Integer>(map.values());
       Collections.sort(s);
       val = s.get(s.size()-1);
       for(String st : map.keySet()){
           if(map.get(st)==val){
              if(result.length()==0){
                   result=st;
               }
               else if(st.compareTo(result)<0){
                 result=st;
               }
           }
       }
       System.out.println(result);
   }
}


//use quick sort to reduce time complexity
