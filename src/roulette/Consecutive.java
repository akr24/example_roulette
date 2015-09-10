package roulette;

import util.ConsoleReader;

public class Consecutive extends Bet {

	public String myDescription;
	public int myOdds;

	public Consecutive(String description, int odds) {
		super( description,  odds);

	}
	
	@Override
	public String placeBet() {
		String result = "";
		result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, Wheel.NUM_SPOTS - 3);
		return result;
	}
	public boolean betIsMade(int whichBet, String betChoice)
	{
		Wheel myWheel=new Wheel();
		  return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                  (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
}