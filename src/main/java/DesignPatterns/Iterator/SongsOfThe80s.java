package DesignPatterns.Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator{
    SongInfo[] bestSongs;

    int arrayValue = 0;

    SongsOfThe80s(){
        bestSongs =new SongInfo[3];
        addSong("HIIII", "Cahin", 1971);
        addSong("smoke", "rapid", 1971);
        addSong("Hello", "Lets go", 1979);
    }

    public void addSong(String songName, String bandName, int year){
        SongInfo songInfo = new SongInfo(songName, bandName, year);
        bestSongs[arrayValue] = songInfo;
        arrayValue++;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
