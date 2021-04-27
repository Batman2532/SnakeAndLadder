
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");
		
		int position=0;
		System.out.println("Position of the player: "+ position);
		int die = (int)(Math.random()*6) + 1;
		System.out.println("Number on die: "+ die);
	}

}
