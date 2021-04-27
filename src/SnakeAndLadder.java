
public class SnakeAndLadder {
	
	public static final int  noPlay = 0;
	public static final int  ladder = 1;
	public static final int  snake = 2;
	
    public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");
		
		int position = 0;
		System.out.println("Position of the player: "+ position);
		int die = (int)(Math.random()*6) + 1;
		System.out.println("Number on die: "+ die);
		int ladderSnake = (int)(Math.random()*3) + 1;
		switch(ladderSnake) {
		case noPlay:
			System.out.println("noPlay is come");
			break;
		case ladder:
			position  = position + die;
			System.out.println("Position of the player: "+ position);
			break;
		case snake:
			position = position +die;
			System.out.println("Position of the player: "+ position);
			break;
		}
	}

}
