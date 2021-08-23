
public class SnakeLadder {
	static int starting_position=0;
	static int current_position1=0;
	static int current_position2=0;
	static int count=0;
	
	public static void main(String[] args) {
		
		System.out.println("Initial position of the player is: "+starting_position);
		play();
		
		System.out.println("Number of times die was rolled to win the game="+count);
	}
	static void play()
	{
		while(true) {
			
			int dieNumber1=(int)(Math.floor(Math.random()*10)%6)+1;
			int option1=(int) (Math.floor(Math.random()*10)%3);
			count+=1;
			switch(option1)//1 for ladder 2 for snake
			{
			case 1: if (current_position1 + dieNumber1 > 100) {
				break;
			} else {
				current_position1 += dieNumber1;
				System.out.println("Player1 Encountered ladder");
				play();
				break;
			}
		
			case 2: if (current_position1 - dieNumber1 < 0) {
				current_position1= 0;
			} else {
				current_position1 -= dieNumber1;
				System.out.println("Player2 Encountered Snake");
			}
			
			break;
					
			default:System.out.println("No play");
			
			}
			System.out.println("Updated position of player1 after rolling the dice "+count+" times="+current_position1);
			if (current_position1 == 100) {
				System.out.println("Player1 won");
				System.exit(0);
			}
			int dieNumber2=(int)(Math.floor(Math.random()*10)%6)+1;
			int option2=(int) (Math.floor(Math.random()*10)%3);

			switch(option2)//1 for ladder 2 for snake
			{
			case 1: if (current_position2 + dieNumber2 > 100) {
				break;
			} else {
				current_position2 += dieNumber2;
				System.out.println("Player2 Encountered ladder");
				play();
				break;
			}
		
			case 2: if (current_position2 - dieNumber2 < 0) {
				current_position2= 0;
			} else {
				current_position2 -= dieNumber2;
				System.out.println("Player2 Encountered Snake");
			}
			
			break;
					
			default:System.out.println("No play");
			
			}
			System.out.println("Updated position of player2 after rolling the dice "+count+" times="+current_position2);
			if (current_position2 == 100) {
				System.out.println("Player2 won");
				System.exit(0);
			}
		}
	}
}
