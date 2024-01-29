package tic_tac_toe;

import java.util.Random;
import java.util.Scanner;

public class Ai_Player extends Player {
	
	Ai_Player(String name, char mark){
		this.name=name;
		this.mark=mark;
	}
       void makeMove() {
	   Scanner sc = new Scanner(System.in);
	   int row;
	   int col;
	  do {
		  Random random = new Random();
		  // it will generate randomly integer form 0 to 3
		  row=random.nextInt(3);
		  col=random.nextInt(3);
	  }while(!isvalidMove(row,col));
	   Tic_Tac_Toe.placemark(row,col,mark);
   }
}