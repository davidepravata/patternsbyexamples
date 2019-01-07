package pattern.adapter.example;

/**
 * Obiettivo: un AudioPlayer supporta la riproduzione di mp3; si vuole aggiungere il supporto per altri formati (mp4, vlc); la classe MediaAdapter permette di istanziare la giusta classe in base al formato del file richiesto
 * Implementazione:
 * 1) inizialmente sono definite le classi per la riproduzione degli mp3: l'interfaccai MediaPlayer e la sua implementazione AudioPlayer;
 * 2) si aggiungono l'interfaccia AdvancedMediaPlayer e classi concrete che la implemementano per gestire Mp4 e Vlc;
 * 3) affinchè AudioPlayer possa riprodurre anche Mp4 e Vlc si crea una classe adapter MediaAdapter, la quale implementa MediaPlayer e usa le implementazioni concrete di AdvancedMediaPlayer (Mp4Player e VlcPlayer) per eseguire i formati richiesti.
 */
public class AdapterPatternMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
