package AbstractInterface.Interface;

public class Main {
    public static void main(String[] args) {
        // Camera cam = new Camera();
        // MP3Player play = new MP3Player();
        // smartPhone sp = new smartPhone();

        // cam.TakePhoto();
        // play.PlayMusic();
        // sp.PlayMusic();
        // sp.TakePhoto();

        TakePhoto[] photoDevice = {
                new Camera(), new smartPhone()
        };

        PlayMusic[] musicDevice = {
                new MP3Player(), new smartPhone()
        };

        for (TakePhoto tp : photoDevice) {
            tp.TakePhoto();
        }
        for (PlayMusic pm : musicDevice) {
            pm.PlayMusic();
        }
    }
}
