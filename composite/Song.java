package DesignPatterns.composite;

public class Song implements IComponent{
    public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

    @Override
    public void play() {
        System.out.println("Song " + songName + " by " + artist + " is played at speed " + speed);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return songName;
    }

    public String getArtist(){
        return artist;
    }
}
