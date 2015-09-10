package roulette;

import util.ConsoleReader;

public class EvenOrOdd extends Bet {

	public String myDescription;
	public int myOdds;

	public EvenOrOdd(String description, int odds) {
		super(description, odds);
	}

	@Override
	public String placeBet() {
		String result = "";

		result = ConsoleReader.promptOneOf("Please bet", "even", "odd");

		return result;
	}
	public boolean betIsMade(int whichBet, String betChoice)
	{
		Wheel myWheel=new Wheel();
		 int start = Integer.parseInt(betChoice);
         return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}
}