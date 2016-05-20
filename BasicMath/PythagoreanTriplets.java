package BasicMath;

/*Pythagorean triplet (a,b,c) satisfies: 
enter image description here

You will be given an integer N. You have to count how many triplets a,b,c exist such that 
1 <= a <= b <= c <= N.

Input: 
First line contains T, the number of testcases. Each testcase consists of only one integer in one line.

Output: 
For each testcase, print the required answer.*/

public class PythagoreanTriplets
{
    public static void main(String[]args){
        int n=5;
        int triplets=0;
        
        for(int i=n ; i>2 ; i--){
            int c = i*i;
            for(int j = n-1 ; j>1 ; j--){
                int b=j*j;
                for(int k=j-1 ; k>0 ; k--){
                   int a=k*k;
                   if(a+b==c){
                       triplets++;
                   }
                }
            }
        }
        System.out.println(triplets);
    }
}

//solved but try to lower time comlexity
