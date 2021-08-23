
public class SnakeLadder {
	
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;
	
	public static void main(String[] args) {
		int starting_position=0;
		int current_position=0;
		int dieNumber=(int)(Math.floor(Math.random()*10)%6)+1;
		int option=(int) (Math.floor(Math.random()*10)%3);
		System.out.println("Initial position of the player is: "+starting_position);
		System.out.println("The outcome of rolled dice:"+dieNumber);
		switch(option)
		{
		case 1: System.out.println("Encountered ladder");
				current_position+=dieNumber;
					break;
		case 2: System.out.println("Encountered snake");
				current_position-=dieNumber;
				break;
				
		default:System.out.println("No play");
		
		}
		System.out.println("Updated position after rolling the dice="+current_position);
	}

}
