package DesignPatterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator{
    ArrayList<SongInfo> bestSongs;

    SongsOfThe70s(){
        bestSongs = new ArrayList<>();
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don Mclean", 1971);
        addSong("Hello", "World Lennon", 1979);
    }

    public void addSong(String songName, String bandName, int year){
        SongInfo songInfo = new SongInfo(songName, bandName, year);
        bestSongs.add(songInfo);
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
