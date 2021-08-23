
public class SnakeLadder {
	
	
	public static void main(String[] args) {
		int starting_position=0;
		int current_position=0;
		int count=0;
		System.out.println("Initial position of the player is: "+starting_position);
		while(true) {
			
		int dieNumber=(int)(Math.floor(Math.random()*10)%6)+1;
		int option=(int) (Math.floor(Math.random()*10)%3);
		count+=1;
		switch(option)//1 for ladder 2 for snake
		{
		case 1: if (current_position + dieNumber > 100) {
			break;
		} else {
			current_position += dieNumber;
			System.out.println("Encountered ladder");
			break;
		}
	
		case 2: if (current_position - dieNumber < 0) {
			current_position = 0;
		} else {
			current_position -= dieNumber;
			System.out.println("Encountered Snake");
		}
		
		break;
				
		default:System.out.println("No play");
		
		}
		System.out.println("Updated position after rolling the dice "+count+" times="+current_position);
		if (current_position == 100) {
			break;
		}
	}
		System.out.println("Number of times die was rolled to win the game="+count);
	}
}
