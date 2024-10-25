/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
    int left=1;
    int right=n;
    int num=-1;
    while(left<=right)
    {
        int num = left+(right-left)/2;
        int gss = guess(num);
        if(gss==0)
        {
            return num;
        }else if(gss==1)
        {
            left = num+1;
        }else
        {
            right = num-1;
        }
    }   
    return -1; 
    }
}
