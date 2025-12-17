import java.util.LinkedList;
class Song {
    String title, artist, genre;
    double duration;
    Song(String title, String artist, double duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }
    @Override
    public String toString() {
        return title + " - " + artist + " (" + duration + " mins, " + genre + ")";
    }
}
public class Playlist {
    LinkedList<Song> songs = new LinkedList<>();
    int currentIndex = 0;
    void addSong(Song s) { songs.add(s); }
    void deleteSong(String title) { songs.removeIf(s -> s.title.equalsIgnoreCase(title)); }
    Song nextSong() {
        if (currentIndex < songs.size()) {
            return songs.get(currentIndex++);
        } else return null; 
    }
    public static void main(String[] args) {
        Playlist p = new Playlist();
        p.addSong(new Song("Shape of You", "Ed Sheeran", 4.2, "Pop"));
        p.addSong(new Song("Believer", "Imagine Dragons", 3.8, "Rock"));
        System.out.println("Next: " + p.nextSong());
        System.out.println("Next: " + p.nextSong());
        p.deleteSong("Believer");
        System.out.println("Playlist after delete: " + p.songs);
    }
}
