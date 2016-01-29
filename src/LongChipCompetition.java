import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {

	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest chip. (In England, French Fries are called "chips".)
	 * 
	 * Find the Beatle with the longest chip. You may not edit the Chip or Beatle classes. Make sure to initialize The Beatles before you start your
	 * search.
	 * 
	 * **/
	public static void main(String[] args) {
		initializeBeatles();
		
	}

	private static ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	private static void initializeBeatles() {
		Beatle George = new Beatle("George");
		Beatle John = new Beatle("John");
		Beatle Paul = new Beatle("Paul");
		Beatle Ringo = new Beatle("Ringo");

		theBeatles.add(George);
		theBeatles.add(John);
		theBeatles.add(Paul);
		theBeatles.add(Ringo);
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in")) chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}
	private Chip getLongestChip(){
		Chip chip = chips.get(0);
		for(Chip c : getChips()){
		if(c.getLength() > chip.getLength()){
			chip = c;
		}
		}
		return chip;
		
	}

	public String getName() {
		return this.name;
	}

}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}

