package LinkList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SongMainClass {
	private static ArrayList<Album> albums = new ArrayList<Album>();
	public static void main(String[] args) {
		 // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()
		
		Album album = new Album("xyz","Raja");
		album.addition("aa", 3.8);
		album.addition("bb", 3.6);
		album.addition("cc", 3.1);
		album.addition("dd", 3.2);
		album.addition("ee", 3.3);
		album.addition("ff", 3.4);
		albums.add(album);
		
		
		album = new Album("abc","Jena");
		album.addition1("gg", 3.9);
		album.addition1("hh", 4.0);
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlayList("aa", playList);
		albums.get(1).addToPlayList("gg", playList);
		
		play(playList);
		
		
	}
	private static void play(LinkedList<Song> playList) {
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() ==0) {
			System.out.println("No songs in the album");
		}else {
			System.out.println("Now playing :"+listIterator.next().toString());
		}
		while(!quit) {
			int action = sc.nextInt();
			switch(action) {
			
			case 1:
                if(!forward) {
                    if(listIterator.hasNext()) {
                        listIterator.next();
                    }
                    forward = true;
                }
                if(listIterator.hasNext()) {
                    System.out.println("Now playing " + listIterator.next().toString());
                } else {
                    System.out.println("We have reached the end of the playlist");
                    forward = false;
                }
                break;

            case 2:
                if(forward) {
                    if(listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    forward = false;
                }
                if(listIterator.hasPrevious()) {
                    System.out.println("Now playing " + listIterator.previous().toString());
                } else {
                    System.out.println("We are at the start of the playlist");
                    forward = true;
                }
                break;
            case 3:
                if(forward) {
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now replaying " + listIterator.previous().toString());
                        forward = false;
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                } else {
                    if(listIterator.hasNext()) {
                        System.out.println("Now replaying " + listIterator.next().toString());
                        forward = true;
                    } else {
                        System.out.println("We have reached the end of the list");
                    }
                }
                break;
            case 4:
                printList(playList);
                break;
            case 5:
                printMenu();
                break;

            case 6:
                if(playList.size() >0) {
                    listIterator.remove();
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    }
                }
                break;
			}
		}
	}
	private static void printMenu() {
		System.out.println("Print Menu");
		System.out.println("0 -> Quit\n"+
							"1 -> Play Next Song\n"+
							"2 -> play previous song\n"+
							"3 -> play current song\n"+
							"4 -> list song on play list\n"+
							"5 -> print available actions");
		
	}
	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();	
		System.out.println("=======================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=======================");
	}

}
