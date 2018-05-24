/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Farid Estepa
 */
public class Inicio extends Pane{
    
    
    public Inicio(){
		super();
		this.setPrefSize(700, 800);
		
		Label titulo = new Label("Éxito");
		titulo.setAlignment(Pos.TOP_CENTER);
		

		Button vender = new Button("Vender");
		
		vender.setOnAction(e -> ((Stage)(((Node) e.getSource()).getScene().getWindow())).setScene(new Scene(new Vender())));
                
                
                

//		Button buttonDosJugadores = new MyButton("Dos Jugadores",200,320,300,100);
//		buttonDosJugadores.getStyleClass().add("roundedButton");
//		buttonDosJugadores.setOnAction(e -> ((Stage)(((Node) e.getSource()).getScene().getWindow())).setScene(new Scene(new PantallaJuego(2,ColorPieza.BLANCO))));
//		Button buttonSalir = new MyButton("Salir",200,560,300,100);
//		buttonSalir.getStyleClass().add("roundedButton");
//		buttonSalir.setOnAction(e-> ((Stage)(((Node) e.getSource()).getScene().getWindow())).close());
		
		this.getChildren().addAll(titulo,vender);
		
		
	}
       
    
}
