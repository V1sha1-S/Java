package AbstractInterface.Interface;

interface PlayMusic {
    void PlayMusic();
};

interface TakePhoto {
    void TakePhoto();
}

class Camera implements TakePhoto {
    @Override
    public void TakePhoto() {
        System.out.println("Camera Takes Photo");
    }
}

class MP3Player implements PlayMusic {
    @Override
    public void PlayMusic() {
        System.out.println("Playing music");

    }
}

class smartPhone implements TakePhoto, PlayMusic {

    @Override
    public void TakePhoto() {
        System.out.println("SmartPhones can take photos");
    }

    @Override
    public void PlayMusic() {
        System.out.println("SmartPhones can play music");
    }
}


