package headsortailsgame;

import java.util.Scanner;
import java.lang.Math;

public class HeadsorTails {

public static void main(String[] args) {

   int correctCount = 0, k = 0, user_guess;
  
   try (Scanner sc = new Scanner(System.in)) {
       System.out.print("\nGuess which will have more: heads or tails? ");
       String headsOrTailsGuess= sc.nextLine();
      
       user_guess = headsOrTailsGuess.equals("heads")?1:2;
      
       System.out.print("\nHow many times shall we flip a coin? ");;
       int numberofFlips= sc.nextInt();
      
       int max = 25;
       int min = 1;
       int range = max - min +1;
       int[] coin_flips = new int[numberofFlips];
      
       for (int i = 0; i < numberofFlips; i++)
       {
           int rand1 = (int)(Math.random()* range) + min;
           coin_flips[k++] = rand1;
       }
      
       for (int i = 0; i < numberofFlips; i++)
       {
           if (coin_flips[i]==1)
           {
               System.out.println("heads");
               if (user_guess == 1)
               {
                   correctCount++;
               }

           }
          
           else if (coin_flips[i]==2)
           {
               correctCount++;
           }
       }
              
int correct_percent = (correctCount*100)/ numberofFlips;
System.out.println("your Guess, "+headsOrTailsGuess+", came up "+correctCount+" times(s). That is" +correct_percent+ "%.");
}
}

	

}