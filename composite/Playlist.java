package DesignPatterns.composite;

import java.util.ArrayList;

public class Playlist implements IComponent {
    public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

    @Override
    public void play() {
        System.out.println("Playlist " + playlistName + " started.");
        for(IComponent song : playlist){
            song.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for(IComponent song : playlist){
            song.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }

    public void add(IComponent song){
        playlist.add(song);
    }

    public void remove(IComponent song){
        playlist.remove(song);
    }

}
