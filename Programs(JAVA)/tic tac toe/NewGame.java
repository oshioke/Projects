public class NewGame
{
	private Board gameBoard; // This is the object of the board that the game will play on
	private int gameMode;
	private String winner="N"; 
	// string winner represents the winner 
	// N for No one
	// D for Draw
	// P1 for player 1
	// P2 for player 2
	// C for computer
	public NewGame(int x){
	
		System.out.println("Starting New Game ....... ");
		System.out.println();
		gameMode = x;
		gameBoard=new Board();
	}
	
	// This method will return the winner's mark
	public void Start(){
		if(gameMode == 1){
			System.out.println("Welcome to Player vs Player Mode ....... ");
			System.out.println("Player 1 will use the mark 'X'   ....... ");
			System.out.println("Player 2 will use the mark '0'   ....... ");
			System.out.println();
			gameBoard.displayBoard();
			do{
				System.out.println("Player 1's Turn ..... ");
				System.out.println();
				
				gameBoard.playerMove("X");
				if (gameBoard.checkWinner("X")){	
					winner="P1";
				}
				else if(gameBoard.checkDrawn()){
					winner="D";
				}
				else{
					System.out.println("Player 2's Turn ..... ");
					System.out.println();
					gameBoard.playerMove("0");
					if (gameBoard.checkWinner("0")){	
						winner="P2";
					}
					else if(gameBoard.checkDrawn()){
					winner="D";
					}
				}
			}while(winner.equals("N"));
		}
		else
		{ 
		// The game Mode 2: Player vs Computer Mode
			System.out.println("Welcome to Player vs Computer Mode ....... ");
			System.out.println("Player 1 will use the mark 'X' ........... ");
			System.out.println("Computer will use the mark '0' ........... ");
			System.out.println();
			gameBoard.displayBoard();
			do{
				System.out.println("Player 1's Turn ....:");
				System.out.println();
				
				gameBoard.playerMove("X");
				if (gameBoard.checkWinner("X")){	
					winner="P1";
				}
				else if(gameBoard.checkDrawn()){
					winner="D";
				}
				else{
					System.out.println("Computer's Turn ....:");
					System.out.println();
					gameBoard.computerMove("0");
					if (gameBoard.checkWinner("0")){	
						winner="C";
					}
					else if(gameBoard.checkDrawn()){
					winner="D";
					}
				}
			}while(winner.equals("N"));
		}
	}
	
	public void DisplayWinner()
	{
		if (winner.equals("D"))
		{
			System.out.println("QQQQQQQQQ  QQQQQQQQQ QQQQQ   QQQQ QQQQQQQQQ       QQQQQQQQ   QQQQQQQ   QQQQQQQQQ QQ      QQ QQQ     QQ    ");
			System.out.println("QQ         QQ     QQ QQ QQ  QQ QQ QQ               QQ    QQ  QQ    QQ  QQ     QQ QQ      QQ QQQQ    QQ 	");
			System.out.println("QQ         QQ     QQ QQ  QQQQ  QQ QQ               QQ     QQ QQ    QQ  QQ     QQ QQ      QQ QQ QQ   QQ		");
			System.out.println("QQ  QQQQQQ QQQQQQQQQ QQ   QQ   QQ QQQQQQQ          QQ     QQ QQQQQQQ   QQQQQQQQQ QQ  QQ  QQ QQ  QQ  QQ		");
			System.out.println("QQ      QQ QQ     QQ QQ        QQ QQ               QQ     QQ QQ  QQ    QQ     QQ QQ QQQQ QQ QQ   QQ QQ  	");
			System.out.println("QQ      QQ QQ     QQ QQ        QQ QQ               QQ    QQ  QQ   QQ   QQ     QQ QQQQ  QQQQ QQ    QQQQ		");
			System.out.println("QQQQQQQQQQ QQ     QQ QQ        QQ QQQQQQQQQ       QQQQQQQQ   QQ    QQ  QQ     QQ QQQ    QQQ QQ     QQQ		");                       
		}
		else if (winner.equals("P1"))
		{
			System.out.println("QQQQQQQ   QQ        QQQQQQQQQ QQ     QQ QQQQQQQQQ QQQQQQQ        Q         QQ      QQ QQQQQQ  QQQ     QQ QQQQQQQQ  	   ");
			System.out.println("QQ    QQ  QQ        QQ     QQ  QQ   QQ  QQ        QQ    QQ      QQ         QQ      QQ   QQ    QQQQ    QQ QQ				");
			System.out.println("QQ    QQ  QQ        QQ     QQ   QQ QQ   QQ        QQ    QQ       Q         QQ      QQ   QQ    QQ QQ   QQ QQ				");
			System.out.println("QQQQQQQ   QQ        QQQQQQQQQ    QQQ    QQQQQQ    QQQQQQQ        Q         QQ  QQ  QQ   QQ    QQ  QQ  QQ QQQQQQQQ		");
			System.out.println("QQ        QQ        QQ     QQ    QQ     QQ        QQ  QQ         Q         QQ QQQQ QQ   QQ    QQ   QQ QQ       QQ		");
			System.out.println("QQ        QQ        QQ     QQ   QQ      QQ        QQ   QQ        Q         QQQQ  QQQQ   QQ    QQ    QQQQ       QQ		");
			System.out.println("QQ        QQQQQQQQQ QQ     QQ  QQ       QQQQQQQQQ QQ    QQ     QQQQQ       QQQ    QQQ QQQQQQ  QQ     QQQ QQQQQQQQ		");                       
		} 
		else if (winner.equals("P2"))
		{
			System.out.println("QQQQQQQ   QQ        QQQQQQQQ QQ     QQ QQQQQQQQQ QQQQQQQ         QQQQQQQQ        QQ      QQ QQQQQQ  QQQ     QQ QQQQQQQQ  	");
			System.out.println("QQ    QQ  QQ        QQ    QQ  QQ   QQ  QQ        QQ    QQ              QQ        QQ      QQ   QQ    QQQQ    QQ QQ				");
			System.out.println("QQ    QQ  QQ        QQ    QQ   QQ QQ   QQ        QQ    QQ              QQ        QQ      QQ   QQ    QQ QQ   QQ QQ				");
			System.out.println("QQQQQQQ   QQ        QQQQQQQQ    QQQ    QQQQQQ    QQQQQQQ         QQQQQQQQ        QQ  QQ  QQ   QQ    QQ  QQ  QQ QQQQQQQQ		");
			System.out.println("QQ        QQ        QQ    QQ    QQ     QQ        QQ  QQ          QQ              QQ QQQQ QQ   QQ    QQ   QQ QQ       QQ		");
			System.out.println("QQ        QQ        QQ    QQ   QQ      QQ        QQ   QQ         QQ              QQQQ  QQQQ   QQ    QQ    QQQQ       QQ		");			
			System.out.println("QQ        QQQQQQQQQ QQ    QQ  QQ       QQQQQQQQQ QQ    QQ        QQQQQQQQ        QQQ    QQQ QQQQQQ  QQ     QQQ QQQQQQQQ		"); 
		} 
		else if (winner.equals("C"))		{
			System.out.println("QQQQQQQ   QQQQQQ   QQQQ    QQQQ QQQQQQQQ  QQ     QQ QQQQQQQQQQ QQQQQQQ QQQQQQQ      QQ      QQ QQQQQQ  QQQ     QQ QQQQQQQQ     ");
			System.out.println("QQ       QQ    QQ  QQ QQ  QQ QQ QQ     QQ QQ     QQ     QQ     QQ      QQ    QQ     QQ      QQ   QQ    QQQQ    QQ QQ           ");
			System.out.println("QQ      QQ      QQ QQ  QQQQ  QQ QQ     QQ QQ     QQ     QQ     QQ      QQ    QQ     QQ      QQ   QQ    QQ QQ   QQ QQ	         ");
			System.out.println("QQ      QQ      QQ QQ   QQ   QQ QQQQQQQQ  QQ     QQ     QQ     QQQQQ   QQQQQQQ      QQ  QQ  QQ   QQ    QQ  QQ  QQ QQQQQQQQ     ");
			System.out.println("QQ      QQ      QQ QQ        QQ QQ        QQ     QQ     QQ     QQ      QQ  QQ       QQ QQQQ QQ   QQ    QQ   QQ QQ       QQ     ");
			System.out.println("QQ       QQ    QQ  QQ        QQ QQ        QQ     QQ     QQ     QQ      QQ   QQ      QQQQ  QQQQ   QQ    QQ    QQQQ       QQ     ");			
			System.out.println("QQQQQQQ   QQQQQQ   QQ        QQ QQ        QQQQQQQQQ     QQ     QQQQQQQ QQ    QQ     QQQ    QQQ QQQQQQ  QQ     QQQ QQQQQQQQ     "); 
		} 
		else
			System.out.println("There is some problem with the code");
	}
}