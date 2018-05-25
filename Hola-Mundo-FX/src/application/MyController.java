package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController {

   @FXML
   private Button sumar;
	
   @FXML
   private Button restar;
	
   @FXML
   private Button multiplicar;

   @FXML
   private TextField num1;
   
   @FXML
   private TextField num2;
   
   @FXML
   private TextField resultado;

   @FXML
   public void initialize() {

	  
   }

   
   
   public void suma(ActionEvent event) {
	   int numa = Integer.parseInt(num1.getText());
	   int numb = Integer.parseInt(num2.getText());
	   resultado.setText(String.valueOf(numa + numb));
   }
   public void restar(ActionEvent event) {
	   int numa = Integer.parseInt(num1.getText());
	   int numb = Integer.parseInt(num2.getText());
	   resultado.setText(String.valueOf(numa - numb));
   }
   public void multiplicar(ActionEvent event) {
	   int numa = Integer.parseInt(num1.getText());
	   int numb = Integer.parseInt(num2.getText());
	   resultado.setText(String.valueOf(numa * numb));
   }

}
