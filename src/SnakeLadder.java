
public class SnakeLadder {
	static int starting_position=0;
	static int current_position1=0;
	static int current_position2=0;
	static int count=0;
	static int turn=0; //0 for player 1's turn 1 for player 2's turn
	
	public static void main(String[] args) {
		
		System.out.println("Initial position of the player is: "+starting_position);
		play();
		
		System.out.println("Number of times die was rolled to win the game="+count);
	}
	static void play()
	{
		while(true) {
			if(turn==0) {
			int dieNumber1=(int)(Math.floor(Math.random()*10)%6)+1;
			int option1=(int) (Math.floor(Math.random()*10)%3);
			count+=1;
			switch(option1)//1 for ladder 2 for snake
			{
			case 1: if (current_position1 + dieNumber1 > 100) {
				turn=1;
				break;
			} else {
				turn=0;
				current_position1 += dieNumber1;
				System.out.println("Player1 Encountered ladder");
				break;
			}
		
			case 2: if (current_position1 - dieNumber1 < 0) {
				current_position1= 0;
			} else {
				current_position1 -= dieNumber1;
				System.out.println("Player2 Encountered Snake");
			}
			turn=1;
			break;
					
			default:turn=1; System.out.println("No play for player1");
			
			}
			System.out.println("Updated position of player1 after rolling the dice "+count+" times="+current_position1);
			if (current_position1 == 100) {
				System.out.println("Player1 won");
				System.exit(0);
			}
			}
			if(turn==1) {
			int dieNumber2=(int)(Math.floor(Math.random()*10)%6)+1;
			int option2=(int) (Math.floor(Math.random()*10)%3);

			switch(option2)//1 for ladder 2 for snake
			{
			case 1: if (current_position2 + dieNumber2 > 100) {
				turn=0;
				break;
			} else {
				turn=1;
				current_position2 += dieNumber2;
				System.out.println("Player2 Encountered ladder");
				break;
			}
		
			case 2: if (current_position2 - dieNumber2 < 0) {
			
				current_position2= 0;
			} else {
				current_position2 -= dieNumber2;
				System.out.println("Player2 Encountered Snake");
			}
			turn=0;
			break;
					
			default:turn=0; System.out.println("No play for player2");
			
			}
			System.out.println("Updated position of player2 after rolling the dice "+count+" times="+current_position2);
			if (current_position2 == 100) {
				System.out.println("Player2 won");
				System.exit(0);
			}
			}
		}
	}
}
