package roulette;

import util.ConsoleReader;

public class RedOrBlack extends Bet {
	public String myDescription;
	public int myOdds;

	
	public RedOrBlack(String description, int odds) {
			super( description,  odds);
	}
	
	@Override
	 public String placeBet() {
	        String result = "";
	        
	            result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	            return result;
	 }
	
	public boolean betIsMade(int whichBet, String betChoice)
	{
		Wheel myWheel=new Wheel();
        return myWheel.getColor().equals(betChoice);

	}
}