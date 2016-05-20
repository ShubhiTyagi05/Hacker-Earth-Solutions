package BasicMath;

//Given an array A having N elements. Find total number of pairs (i,j) such that j < i and Aj = Ai.

//uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

class FindPair {
   public static void main(String args[] ) throws Exception {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String line ;
        List<Integer> list = new ArrayList<Integer>();
        int i=0;
        while( (line = br.readLine()) != null) {
          if(i==1){
           String[] splited = line.split(" ");
           for(String s : splited){
               list.add(Integer.parseInt(s));
               int n=Integer.parseInt(s);
               }
          }
        i++;
       }
       //Collections.sort(list);
       findPairs(list);
   }
   
   public static void findPairs(List<Integer> list){
       long count=0;
       for(int i=0 ; i<list.size()-1 ; i++){
           int a = list.get(i);
           for(int j=i+1 ; j<list.size() ; j++){
               int b=list.get(j);
               if(a==b){
                   count++;
               }
           }
       }
       System.out.println(count);
   }
}