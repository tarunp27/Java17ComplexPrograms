package Chapter3;

public class q74 {
}
class Song {
//    public void playMusic() {
//        System.out.print("Play!");
//    }
    private static void playMusic() {
        System.out.print("Music!");
    }
    private static void playMusic(String song) {
        System.out.print(song);
    }
    public static void main(String[] tracks) {
        new Song().playMusic();
    } }