/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Button;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Farid Estepa
 */
public class Interfaz extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
        
        
//     Application.launch(args);  
//        System.out.println("kjb");
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//      
//        GridPane g= new GridPane();
//        Button administrador= new Button("Administrador");
//        Button cajero= new Button("Cajero");
//        
//        g.setAlignment(Pos.CENTER);
//        g.add(getVBox(), 2, 2);
//    
//        Scene scene= new Scene(g, 700, 700);
//        primaryStage.setTitle("Éxito");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    
//    }
//    
//     private Pane getVBox() throws FileNotFoundException{
//        VBox vBox = new VBox();
//      FileInputStream input = 
//                new FileInputStream("exito.jpg");
//        Image image = new Image(input);
//        Label label3 = new Label(null,
//                
//                new ImageView(image));  
//      vBox.setSpacing(20);
//      vBox.getChildren().add(label3);
//      vBox.getChildren().add(new javafx.scene.control.Button("administrador"));
//      vBox.getChildren().add(new javafx.scene.control.Button("Cajero"));
//        
//        return vBox;
//    
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
   primaryStage.setScene(new Scene(new Inicio()));
             primaryStage.setTitle("Éxito");
		
		primaryStage.setResizable(false);
		primaryStage.show();  }
    
}
