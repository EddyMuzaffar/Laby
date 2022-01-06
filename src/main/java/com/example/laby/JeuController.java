package com.example.laby;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class JeuController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private AnchorPane anchorJeu;

    @FXML
    private VBox boxAvant;

    private int choix = 0;

    @FXML
    private MenuItem choixAkgo1;

    @FXML
    private MenuItem choixalgo2;

    @FXML
    private Label idlabel1;

    @FXML
    private Button idBtnParti;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    boxAvant.setVisible(true);
    anchorJeu.setVisible(false);

    idlabel1.setText("algo0");

    choixAkgo1.setOnAction(btnacton ->{
            choix = 1;
            idlabel1.setText("algo1");
        });
        choixalgo2.setOnAction(btnacto ->{
            choix = 2;
            idlabel1.setText("algo2");
        });

    idBtnParti.setOnMouseClicked(btnact -> {
        boxAvant.setVisible(false);
        anchorJeu.setVisible(true);

        PlayFonction.grille(anchorJeu);
    });





    }

    public void switchToMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(MenuApplication.class.getResource("menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
