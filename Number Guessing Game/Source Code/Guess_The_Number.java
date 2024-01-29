package guess_the_number;

import java.util.Random;

import javax.swing.JOptionPane;

public class Guess_The_Number {

    public static void main(String[] args) {
    	Random random = new Random();
    	
        int computerNumber = random.nextInt(100)+1;
        int userAnswer =0;
        int count = 1;
        int maxAttempts=5;
        while(userAnswer != computerNumber) {
        	if(count == maxAttempts) {
        		JOptionPane.showMessageDialog(null,"Your chances of attemptsare crossed,Thank You for playing!");
        		break;
        	}
        	String response = JOptionPane.showInputDialog("Enter a guess between 1 and 100");
        	userAnswer = Integer.parseInt(response);
        	JOptionPane.showMessageDialog(null, determineGuess(userAnswer, computerNumber, count, maxAttempts));
        	count++;
        }
        }

	private static Object determineGuess(int userAnswer, int computerNumber, int count, int maxAttempts) {
		if (userAnswer <=0 || userAnswer >100) {
			return "Invalid Guess";
			
		}
		else if(userAnswer == computerNumber){
			return "Correct!\nTotal Guesses:"+count;
		}
		else if(userAnswer > computerNumber){
			return "Your guess is too high, try Again.\nTry Number:" +count;
		}
		else {
			return "Your guess is too low,try again\nTry Number:" +count;
		}
		
	}
    }