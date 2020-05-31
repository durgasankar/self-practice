package LinkList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String albumName;
	private String albumArtist;
	private ArrayList<Song> song;
	public Album(String albumName, String albumArtist) {
		super();
		this.albumName = albumName;
		this.albumArtist = albumArtist;
		this.song = new ArrayList<Song>();
	}
	private Song findSong(String title) {
		for(Song checkedSong : this.song) {
			if(checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}
	
	private boolean findSong1(String title) {
		for(Song checkedSong : song) {
			if(checkedSong.getTitle().equals(title)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addition1(String title, double duration) {
		if(findSong1(title) != true) {
			this.song.add(new Song(title,duration));
			return true;
		}else
			
		return false;
	}
	
	public boolean addition(String title, double duration) {
		if(findSong(title) == null) {
			this.song.add(new Song(title, duration));
			return true;
		}
		return false;
	}
	
	public boolean removeSong(String title) {
		if(findSong(title) !=null) {
			this.song.remove(title);
			return true;
		}
		return false;
	}
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		int index = trackNumber-1;
		if((index >= 0) && (index <= this.song.size())) {
			playList.add(this.song.get(index));
			return true;
		}else {
			System.out.println("album does not have a track : "+trackNumber);
			return false;
		}
	}
	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}else;
		System.out.println("album does not have a track : "+title);
		return false;
	}

}
