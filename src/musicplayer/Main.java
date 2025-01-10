package musicplayer;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        //create a MusicList
        MusicList musicList=new MusicList();
        
         Scanner myObj = new Scanner(System.in);
        System.out.println("Please Enter a Song: ");
        
        String userSong = myObj.nextLine();
        System.out.println("The Song Added is: " + userSong);

        //Add Songs
        Song[] songs = new Song[10];
        songs[0]=new Song(" Drake ", "Passionfruit - 231 Million Plays",2017);
        songs[1]=new Song(" Lil Mosey ", "Blueberry Faygo - 353 Million Plays",2020);
        songs[2]=new Song(" Eminem ", "Mockingbird - 1.1 Billion Plays",2004);
        songs[3]=new Song(" Dave ", "Thiago Silva - 61 Million Plays",2016);
        songs[4]=new Song(" Oasis ", "Wonderwall - 480 Million Plays",1995);
        songs[5]=new Song(" Lil Tecca ", "Ransom - 505 Million Plays",2019);
        songs[6]=new Song(" AJ Tracey ", "Ladbroke Grove - 59 Million Plays",2019);
        songs[7]=new Song(" Fleetwood Mac ", "Dreams - 185 Million Plays",1993);
        songs[8]=new Song(" Joy Division ", "Love Will Tear Us Apart - 87 Million Plays",2008);
        songs[9]=new Song(" Courteeners ", "No You Didn't, No You Don't - 1.4 Million Plays",2008);

        for (Song song:songs){
            musicList.addSong(song);
        }
        musicList.printMusicList();
        System.out.println(musicList.getMusicListSize());
        musicList.findByArtist("Courteeners");
        musicList.getRandomSong();
        musicList.removeSong("No You Didn't, No You Don't");
        System.out.println("==================");
        musicList.printMusicList();
    }
}