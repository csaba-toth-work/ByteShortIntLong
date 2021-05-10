package datastructures.linkedlists.challenge2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private boolean goingForward;
    private LinkedList<Song> songs;

    public Playlist() {
        this.songs = new LinkedList<>();
        this.goingForward = true;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song, Album album) {
        if (album.getSongs().contains(song) && !songs.contains(song)) {
            this.songs.add(song);
        } else {
            System.out.println("Can not add this song, since you dont own it in your album");
        }
    }

    public void printInfo() {
        System.out.println("Press the specified number for your option");
        System.out.println("0 - quit \n 1 - Skip \n 2 - forward \n 3 - backwards \n 4 - menu");
    }

    public void skip() {
        ListIterator<Song> songListIterator = songs.listIterator();
        if (songListIterator.hasNext()) {
            songListIterator.next();
        }

        if (songListIterator.hasNext()) {
            songListIterator.next();
        }
        if (goingForward && songListIterator.hasNext()) {
            songListIterator.next();
            goingForward = true;
        }
    }

    public void forward() {
        ListIterator<Song> songListIterator = songs.listIterator();
        if (!goingForward) {
            if (songListIterator.hasNext()) {
                songListIterator.next();
                goingForward = true;
            }
        } else {
            if (songListIterator.hasNext()) {
                songListIterator.next();
                goingForward = true;
            }
        }
    }

    public void backwards() {
        ListIterator<Song> songListIterator = songs.listIterator();
        if (goingForward) {
            if (songListIterator.hasNext()) {
                songListIterator.next();
                goingForward = false;
            }
        } else {
            if (songListIterator.hasNext()) {
                songListIterator.next();
                goingForward = false;
            }
        }

    }

    public void menu() {
        printInfo();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        boolean quit = false;
        while (quit) {
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    skip();
                    break;
                case 2:
                    forward();
                    break;
                case 3:
                    backwards();
                    break;
                case 4:
                    menu();
                    break;
            }

        }
    }
}
