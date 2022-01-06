package com.example.laby;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void swtichToPlay(ActionEvent event) throws IOException {
        root = FXMLLoader.load(MenuApplication.class.getResource("avant-jeu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void swtichToScore(ActionEvent event) throws IOException {
        root = FXMLLoader.load(MenuApplication.class.getResource("score.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void QuitterJeu(ActionEvent actionEvent) {
        System.exit(0);
    }

}
