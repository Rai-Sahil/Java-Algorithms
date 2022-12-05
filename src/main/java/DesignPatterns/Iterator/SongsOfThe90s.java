package DesignPatterns.Iterator;


import java.util.HashMap;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator{
    HashMap<Integer, SongInfo> bestSongs = new HashMap<>();

    int hashKey = 0;

    SongsOfThe90s(){
        addSong("room", "ble ble", 1971);
        addSong("sut", "shunt", 1971);
        addSong("MJ", "power", 1979);
    }

    public void addSong(String songName, String bandName, int year){
        SongInfo songInfo = new SongInfo(songName, bandName, year);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
