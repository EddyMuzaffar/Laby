package com.example.laby;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class PlayFonction {

    public static void grille(AnchorPane pane){
         List<Rectangle> rectangle = new ArrayList<Rectangle>();
         int size = 350;
         int spot = 20;
         int quareSize = size / spot ;
         for ( int i =0; i<size; i += quareSize ){
             for ( int j = 0; j<size; j+= quareSize){

                 Rectangle r = new Rectangle(i,j,quareSize,quareSize);
                 r.setFill(Color.WHITE);
                 r.setStroke(Color.BLACK);
                 pane.getChildren().add(r);
                 rectangle.add(r);
                 System.out.println(r);
             }
         }
    }
}
