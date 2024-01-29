package tic_tac_toe;

public class Tic_Tac_Toe {
//creating 2 dimensional array
 static char[][] board;
//creating constructor
public Tic_Tac_Toe() {
//Initialization of 2 dimensions array
	board = new char[3][3];
	initBoard();
}
void initBoard() {
	//create a for loop for row
	for(int i=0;i<board.length;i++) {
		//create after loop for column
		for(int j=0;j<board[i].length;j++) {
			//initialize empty character now every cell will placed with empty character
			board[i][j]=' ';
		}
	}
}
static void dispBoard() {
	System.out.println("-------------");
	for(int i=0;i<board.length;i++) {
		System.out.print("| ");
	
		for(int j=0;j<board[i].length;j++) {
			System.out.print(board[i][j] + " | ");
				
		}
		System.out.println();
		System.out.println("-------------");
	
    }
}


 static void placemark(int row, int col, char mark) {
	if(row>=0 && row<=2 && col >=0 && col<=2) {
		board[row][col]=mark;
	}
	else {
		System.out.println("Invalid Position ");
	}
	
}
// to check column wise win
 static boolean checkcolwin() {

	for(int j=0;j<=2; j++) {
		if(board[0][j]!=' ' &&   board[0][j]==board[1][j] && board[1][j]==board[2][j] ) {
			return true;
		}	
	}
	return false;
}

 static boolean checkrowwin() {
	for(int i=0;i<=2;i++) {
		if(board[i][0]!=' ' &&  board[i][0]== board[i][1] && board[i][1]== board[i][2]) {
			return true;
		}
	}
	return false;
}
static boolean checkDiagwin() {
	if(board[0][0]!=' '  &&    board[0][0]== board[1][1] &&
			board[1][1]==board[2][2]
			||board[0][2]!=' ' &&    board[0][2]== board[1][1] && 
			board[1][1]==board[2][0] ) {
		return true;
	}
	else {
		return false;
}

}
static boolean checkDraw() {
	for(int i=0;i<=2;i++) {
		for (int j=0;j<=2;j++) {
			if(board[i][j]== ' ') {
				return false;
			}
			
		}
	}
	return true;
}
}



