package abstractinnerclassesandinterfaces.innerclasses.playlistchallenge;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep purple");
        album.addSong("Stormbringer", 5.6);
        album.addSong("Love dont mean a thing", 4.6);
        album.addSong("Holy man", 6.6);
        album.addSong("Hold on", 43.6);
        album.addSong("Lady double dealer", 45.6);
        album.addSong("You cant do it right", 1.6);
        album.addSong("The gipsy", 2.6);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 12.44);
        album.addSong("I put the finger on you", 78.44);
        album.addSong("Lets go", 3.44);
        album.addSong("Inject a venom", 12.44);
        album.addSong("Snowballed", 4.44);
        album.addSong("Evil Walks", 7.44);
        album.addSong("Night of the long knives", 1.44);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You cant do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(1).addToPlayList("Snowballed", playList);
        albums.get(0).addToPlayList("Evil Walks", playList);
        albums.get(1).addToPlayList("Evil Walks", playList);
        albums.get(1).addToPlayList("Speed king", playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean isQuit = false;
        boolean isForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!isQuit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    isQuit = true;
                    break;
                case 1:
                    if(!isForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        isForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        isForward =  false;
                    }
                    break;
                case 2:
                    if(isForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        isForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        isForward = true;
                    }
                    break;
                case 3:
                    if(isForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            isForward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            isForward = true;
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
                    if (playList.size() > 0) {
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
        System.out.println("Available actions: \n press");
        System.out.println("0 - to quit \n 1 - to play next song \n 2 - to play previous song \n " +
                "3 - to replay the current song \n 4 - list songs in the playlist \n" +
                "5 - print available actions \n 6 - delete current song from playlist.");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================");
    }



}
