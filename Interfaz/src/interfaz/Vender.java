/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Farid Estepa
 */
public class Vender extends Pane{
    
private Label titulo;
	
	

    public Vender() {
  super();       
 this.setPrefSize(700, 800); 
BorderPane borderPane= new BorderPane();
Button b= new Button("Ok");


 
borderPane.setBottom(b);
borderPane.setTop(getGriD());

this.getChildren().add(borderPane);
    
     
    }    
    
public Pane getGriD(){

GridPane g= new GridPane();

Label codigo= new Label("Ingrese Codigo de barras");
Label cantidad= new Label("Ingrese Cantidad Producto");


g.getChildren().add(cantidad);
g.getChildren().add(codigo);

return this;
}
    
    
}
