package datastructures.linkedlists.challenge2;

public class Main {

    public static void main(String[] args) {

        Album myFirstAlbum = new Album("myFirstAlbum");
        Song myFirstSong = new Song("First", 5.5, "myFirstAlbum");
        Song mySecondSong = new Song("Second", 4.5, "myFirstAlbum");
        Song myThirdSong = new Song("Third", 1.2, "myFirstAlbum");
        Song myFourthSong = new Song("Fourth", 9.4, "myFirstAlbum");
        Playlist myPlaylist = new Playlist();

        myFirstAlbum.getSongs().add(myFirstSong);
        myFirstAlbum.getSongs().add(mySecondSong);
        myFirstAlbum.getSongs().add(myThirdSong);

        myPlaylist.addSong(myFirstSong, myFirstAlbum);
        myPlaylist.addSong(mySecondSong, myFirstAlbum);
        myPlaylist.addSong(myThirdSong, myFirstAlbum);
        myPlaylist.addSong(myFourthSong, myFirstAlbum);

//        ListIterator<Song> songListIterator = myPlaylist.getSongs().listIterator();
//
//        while (songListIterator.hasNext()) {
//            Song nextSong = songListIterator.next();
//            System.out.println("Title: " + nextSong.getTitle() + " Album: " + nextSong.getNameOfAlbum());
//
//        }
        myPlaylist.menu();


    }
}
