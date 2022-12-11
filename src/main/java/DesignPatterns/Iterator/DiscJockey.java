package DesignPatterns.Iterator;

import java.sql.SQLOutput;
import java.util.Iterator;

public class DiscJockey {
    SongIterator iter70;
    SongIterator iter80;
    SongIterator iter90;

    public DiscJockey(SongIterator new70, SongIterator new80, SongIterator new90){
        iter70 = new70;
        iter80 = new80;
        iter90 = new90;
    }

    public void showTheSongs(){
        Iterator songs70 = iter70.createIterator();
        Iterator songs80 = iter80.createIterator();
        Iterator songs90 = iter90.createIterator();

        printTheSong(songs70);
        System.out.println();
        printTheSong(songs80);
        System.out.println();
        printTheSong(songs90);
    }

    public void printTheSong(Iterator iterator){
        while(iterator.hasNext()){
            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYear());
        }
    }

    public static void main(String[] args){
        SongsOfThe70s s70 = new SongsOfThe70s();
        SongsOfThe80s s80 = new SongsOfThe80s();
        SongsOfThe90s s90 = new SongsOfThe90s();

        DiscJockey mike = new DiscJockey(s70, s80, s90);

        mike.showTheSongs();
    }
}
