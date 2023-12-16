import java.util.Random;
import java.util.*;
public class NumberGuessGame{
    private static final int Min=1;
    private static final int Max=1;00
    private static final int Max_attempts=10;
    private static final int Max_rounds=3;
    
    public static void main(String[] args){
        Random random=new Random();
        Scanner s=new Scanner(System.in);
        int totalscore=0;
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total no of rounds : 3");
        System.out.println("Attempts to guess number in each round : 10\n");
        for(int i=1;i<=Max_rounds;i++){
            int number=random.nextInt(Max)+Min;
            int attempts=0;
            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n",i,Min,Max,Max_attempts);
            while(attempts<Max_attempts){
                System.out.println(x:"Enter your guess : ");
		int guess_number=s.nextInt();
		attempts+=1;
		if(guess_number==number){
		   int score=Max_attempts-attempts;
		   totalscore+=score;
		   System.out.printf("Yayy! Number Guessed Successfully. Attempts = %d. Round Score=%d\n",attempts,score);
		   break;
		}
		else if(guess_number<number){
		   System.out.printf("The number is greater than %d. Attempts left = %d.\n",guess_number,Max_attempts-attempts);
		}
		else if(guess_number>number){
		   System.out.printf("The number is less than %d. Attempts left = %d.\n",guess_number,Max_attempts-attempts);
		}
	    }
   	    if(attempts==Max_attempts){
		System.out.printf("\nRound = %d\n",i);
		System.out.println("Attempts = 0");
		System.out.printf("The Random Number is : %d\n\n",number);
	    }
	 }
System.out.printf("Game Over. Total Score = %d\n",totalscore);
s.close();
            }
        }