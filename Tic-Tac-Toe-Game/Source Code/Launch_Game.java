package tic_tac_toe;

public class Launch_Game {

	public static void main(String[] args) {
		Tic_Tac_Toe  t = new Tic_Tac_Toe();
		Human_Player p1 = new Human_Player("Bob", 'X');
		Ai_Player p2 = new Ai_Player("AI", 'O');
		Player cp;
		cp=p1;
		while(true) {
			System.out.println(cp.name  +  "Turn");
			cp.makeMove();
			Tic_Tac_Toe.dispBoard();
			if(Tic_Tac_Toe.checkcolwin() || Tic_Tac_Toe.checkrowwin() || Tic_Tac_Toe.checkDiagwin()) {
			System.out.println(cp.name +"Has Won");
			break;
		}
			else if(Tic_Tac_Toe.checkDraw()) {
				System.out.println("Game is a Draw");
			}
			else {
				if(cp==p1) {
					cp=p2;
				}
				else {
					cp=p1;
				}
			}

		}
}
}