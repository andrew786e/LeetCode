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
        int highestNumber = n ;
        int lowestNumber = 1 ; 

        while(lowestNumber <= highestNumber){
            int guess = lowestNumber + (highestNumber - lowestNumber)/2 ;
            int result = guess(guess) ;
            if(result ==  1){
                lowestNumber = guess + 1 ;
            }else if(result == -1){
                highestNumber = guess - 1 ;
            }else if(result == 0){
                return guess;
            }
        }

        return -1 ;
    }
}
