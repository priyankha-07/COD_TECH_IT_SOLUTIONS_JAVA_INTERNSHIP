package tic_tac_toe;

import java.util.Scanner;

public class Human_Player extends  Player{
	
	Human_Player(String name, char mark){
		this.name=name;
		this.mark=mark;
	}
       void makeMove() {
	   Scanner sc = new Scanner(System.in);
	   int row;
	   int col;
	  do {
		  System.out.println("Enter the Row and Col");
		    row= sc.nextInt();
		    col = sc.nextInt();
	  }while(!isvalidMove(row,col));
	   Tic_Tac_Toe.placemark(row,col,mark);
   }
   
   
}
