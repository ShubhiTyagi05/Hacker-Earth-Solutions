package SearchingAndSwapping;

/*
 * Watson gives to Sherlock a bag of numbers [1, 2, 3 ... N] and then he removes
 * K numbers A1, A2 ... AK from the bag. He now asks Sherlock to find the P'th
 * smallest number in the bag. 
 * Input - First line contains T, the number of test
 * cases. Each test case consists of N, K and P followed by K integers in next
 * line denoting the array A. 
 * Output - For each test case, print P'th smallest
 * number in the bag. If no such number exists output -1.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

class SherlockNumbers {
   public static void main(String args[] ) throws Exception {
       
       // Read input from stdin and provide input before running
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line ;
        List<Integer> listremove = new ArrayList<Integer>();
        int i=0;
        int n=-1;
        int p=-1;
        while( (line = br.readLine()) != null) {
          int j=0;
          if(i%2==1){
           String[] splited = line.split(" ");
           for(String s : splited){
               if(j==0){
                    n=Integer.parseInt(s);
               }
               else if(j==2){
                   p=Integer.parseInt(s);
               }
               j++;
           }
          }
          else if (i!=0){
           String[] splited = line.split(" ");
           for(String s : splited){
               listremove.add(Integer.parseInt(s));
               }
           if(n!=-1 && p!=-1 && listremove.size()>0){
               getResult(n,p,listremove);
               n=-1;
               p=-1;
               listremove.clear();
           }   
          }
          
        i++;
       }
   }
   
   public static void getResult(int n, int p , List<Integer> remove){
       int count=0;
       boolean present=false;
       for(int i=1 ; i<=n ; i++){
           if(!remove.contains(i)){
               count++;
               if(count==p){
               System.out.println(i);
               present=true;
               break;
               }
           }
       }
       if(present==false){
               System.out.println(-1);
       }
   } 
   
}


//partially solved, try to reduce time complexity