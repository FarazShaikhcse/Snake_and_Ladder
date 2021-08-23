
public class SnakeLadder {
	
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;
	
	public static void main(String[] args) {
		int starting_position=0;
		int current_position=0;
		System.out.println("Initial position of the player is: "+starting_position);
		while(true) {
			
		int dieNumber=(int)(Math.floor(Math.random()*10)%6)+1;
		int option=(int) (Math.floor(Math.random()*10)%3);
		
		switch(option)
		{
		case 1: System.out.println("Encountered ladder");
				current_position+=dieNumber;
					break;
		case 2: if (current_position - dieNumber < 0) {
			current_position = 0;
		} else {
			current_position -= dieNumber;
		}
		System.out.println("Encountered Snake");
		break;
				
		default:System.out.println("No play");
		
		}
		System.out.println("Updated position after rolling the dice="+current_position);
		if (current_position >= 100) {
			break;
		}
	}
	}
}
