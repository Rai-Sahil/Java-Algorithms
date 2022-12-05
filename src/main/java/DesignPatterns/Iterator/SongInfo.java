package DesignPatterns.Iterator;

public class SongInfo<K, V> {
    K songName;
    K bandName;
    V year;

    SongInfo(K songName, K bandName, V year){
        this.songName = songName;
        this.bandName = bandName;
        this.year = year;
    }

    public K getSongName(){ return songName; }
    public K getBandName(){ return bandName; }
    public V getYear(){ return year; }
}
