import java.util.ArrayList;

public class CDPlayer {

	public static void main(String[] args) {
		ArrayList<Song> CD = new ArrayList<Song>();
		CD.add(new Song("InhumanThoughts", 4, "Gorgeous Freeman"));
		CD.add(new Song("HeavysNewWeapon", 4, "Heavy"));
		CD.add(new Song("ShowMeDaBooty", 4, "Gorgeous Freeman"));
		System.out.println("The total amount of minutes burned onto this Disk is " + getDuration(CD) + " minutes.");
		System.out.println("Gorgeous Freeman has produced " + getSongsforSinger(CD, "Gorgeous Freeman") + " Songs.");
	}

	public static int getDuration(ArrayList<Song> CD) {
		int number = 0;
		for (Song i : CD) {
			number = number + i.getLength();
		}
		return number;
	}

	public static int getSongsforSinger(ArrayList<Song> CD, String Name) {
		int songs = 0;
		for (Song i : CD) {
			if (i.getSinger().equals(Name)) {
				songs = songs + 1;
			}
		}
		return songs;
	}
}
