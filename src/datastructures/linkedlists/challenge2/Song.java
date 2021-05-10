package datastructures.linkedlists.challenge2;

public class Song {
    private String title;
    private double duration;
    private String nameOfAlbum;

    public Song(String title, double duration, String nameOfAlbum) {
        this.title = title;
        this.duration = duration;
        this.nameOfAlbum = nameOfAlbum;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getNameOfAlbum() {
        return nameOfAlbum;
    }
}
