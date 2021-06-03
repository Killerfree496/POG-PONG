package sample.classes;


import java.applet.Applet;
import java.applet.AudioClip;

public class PlaySound extends Applet {
    AudioClip music = null;

    public void init()
    {
        music = getAudioClip(getCodeBase(),"music/JuiceWRLDBWinsturmental.mp3");
        music.play();

}
}