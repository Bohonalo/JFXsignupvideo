package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controller implements Initializable {

    @FXML
    private MediaView mediaView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Media media=new Media(getClass().getResource("Baby Marvake Maanegi Raftaar HD-VipKHAN.mp4").toExternalForm());
        MediaPlayer player=new MediaPlayer(media);
        mediaView.setMediaPlayer(player);
        player.setVolume(0);
        player.play();

    }
}
