package AbstractInterface.Interface;

public class Main {
    public static void main(String[] args) {
        Camera cam = new Camera();
        MP3Player play = new MP3Player();
        smartPhone sp = new smartPhone();

        cam.TakePhoto();
        play.PlayMusic();
        sp.PlayMusic();
        sp.TakePhoto();
        // Gadgets[] functions = {
        // new Camera(),
        // new MP3Player(),
        // new smartPhone()
        // };

        // for (Gadgets fun : functions) {
        // fun.TakePhoto();
        // fun.PlayMusic();
        // }
    }
}
