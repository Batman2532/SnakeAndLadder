
public class SnakeAndLadder {
	
	public static final int  noPlay = 0;
	public static final int  ladder = 1;
	public static final int  snake = 2;
	public static final int  winPosition = 100;
	public static final int  positionCheck = 0;
	public static boolean  constant = true;
	
	
    public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");
		int numberOfDie=0;
		int player1Position = 0, player2Position=0;
		
		while ( player1Position < winPosition && player2Position < winPosition) {
		
		int die = (int)(Math.random()*6) + 1;
		numberOfDie++;
		
		System.out.println("Number on die: "+ die);
		int ladderSnake = (int)(Math.random()*3) + 1;
		
		switch(ladderSnake) {
		case noPlay:
			if(constant) {
				System.out.println("player1 chance skipped");
				constant=false;
			}else
			{
				System.out.println("player2 chance skipped");
				constant=true;
			}	
			break;
		
		case ladder:
			
			if(constant) {
				if ((player1Position+die)<=winPosition) {
				player1Position=player1Position+die;
			}
				System.out.println("Position of the player1: "+ player1Position);
//				numberOfDie++;
			}else
			{
				if ((player2Position+die)<=winPosition) {
					player2Position=player2Position+die;
				}
				System.out.println("Position of the player2: "+ player2Position);
//				 numberOfDie++; 
			}	
			break;
		case snake:
			if(constant)	{		
				constant=false;
				player1Position=player1Position - die;
				if((player1Position-die)<positionCheck) {
					player1Position=positionCheck;
			}
				
				System.out.println("Position of the player1: "+ player1Position);
//				numberOfDie++;
			}else
			{
				constant=true;
				player2Position=player2Position - die;
				if((player2Position-die)<positionCheck) {
					player2Position=positionCheck;
			}
				
				System.out.println("Position of the player2: "+ player2Position);
//				numberOfDie++;
			}
			break;
		}
		}
		System.out.println("Nummber of Die used: "+ numberOfDie);
		
		if(player1Position == 100) {

            System.out.println("Player 1 won the game..................!");

        } else {

            System.out.println("Player 2 won the game..................!");
        }
  }
}
