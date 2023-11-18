// MusicLibrary.java
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

 class MusicLibrary {
    private List<String> songs;

    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void playRandomSong() {
        if (!songs.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(songs.size());
            System.out.println("Playing: " + songs.get(index));
        } else {
            System.out.println("No songs in the library.");
        }
    }
}
