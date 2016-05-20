package BasicMath;

/*
 * Today, N candies were placed on the table. At any point, for the purpose of
 * clarity, let X represent the number of candies left on the table. Every day,
 * at 9 PM, if the number of candies remaining is divisible by 2, the child will
 * take exactly X/2 candies. Otherwise, he will take (X+1)/2 candies. In
 * addition, every day at 10 PM, another child will come and take X//4, where
 * the "//" here represents integer division. Please, find the number of candies
 * left at 11 PM after T days have passed.
 */
public class ChildrenLoveCandies
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int total = 2;
        int left = 2;
        int days =1;
        for(int i=1; i<=days ; i++){
            if(left%2==0){
                left=left/2;
            }
            else {
                left = (left-1)/2;
            }
            left = left - (left/4);
        }
        System.out.println(left);
    }
}

//partially solved