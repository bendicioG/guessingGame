import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Random rand = new Random();
        int x = rand.nextInt(100);
        int guesses = 0;

        Scanner scan = new Scanner(System.in);
        int guess; 
        
        do {
            System.out.println("Enter a guess: ");

            guess = scan.nextInt();
            guesses = (guesses+1);   

            if (guess<x) {
                System.out.println("Too low!");
            } 
            if (guess>x) {
                System.out.println("Too high!");
            }
            if (guess==x && guesses<=7) {
                System.out.println("You got an impossibly good score!");
            }
            if (guess==x && guesses==8) {
                System.out.println("You did a good job!");
            }
            if (guess==x && guesses==9) {
                System.out.println("You did a good job!");
            }
            if (guess==x && guesses==10) {
                System.out.println("You did a good job!");
            }
            if (guess==x && guesses>10) {
                System.out.println("Wow, epic fail.");
            }

        } while (guess!=x);
    }
}