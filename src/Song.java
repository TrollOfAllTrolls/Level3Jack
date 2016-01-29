
public class Song {
	String Song;
	int Length;
	String Singer;

	public Song(String song, int length, String singer) {
		this.Song = song;
		this.Length = length;
		this.Singer = singer;
	}

	public int getLength() {
		return Length;
	}

	public String getSinger() {
		return Singer;
	}
}
