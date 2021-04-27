
public class SnakeAndLadder {
	
	public static final int  noPlay = 0;
	public static final int  ladder = 1;
	public static final int  snake = 2;
	public static final int  winPosition = 100;
	public static final int  positionCheck = 0;
    public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");
		int numberOfDie=0;
		int position = 0;
		System.out.println("Position of the player: "+ position);
		
		while ( position <= winPosition) {
		if(position<0) {
			position = 0;
		}
		else {
		int die = (int)(Math.random()*6) + 1;
		
		System.out.println("Number on die: "+ die);
		int ladderSnake = (int)(Math.random()*3) + 1;
		
		switch(ladderSnake) {
		case noPlay:
			System.out.println("noPlay is come");
			break;
		case ladder:
			
			position=position + die;
			System.out.println("Position of the player: "+ position);
			numberOfDie++;
			break;
		case snake:
			
			position=position - die;
			
			System.out.println("Position of the player: "+ position);
			numberOfDie++;
			break;
		}
		}
		System.out.println("Nummber of Die used: "+ numberOfDie);
	}
  }
}
