package com.mycompany.reto10;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import Formulas.Esfera;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class PrimaryController {

    @FXML
    private Label etiquetaCambio;
    @FXML
    private Button btnCalVol;
    @FXML
    private Button btnCalSuper;
    @FXML
    private Button btnCalArea;
    @FXML
    private Button btnCalper;
    @FXML
    private TextField radEsfera;
    @FXML
    private TextField radCirculo;
    @FXML
    private TextArea resultado;
    

  
       
    @FXML
    private void calcularTextoVol (ActionEvent event){
        etiquetaCambio.setText("Solucion Volumen Esfera.");
        Esfera r = new Esfera();
        Double radio = r.volumen(Double.parseDouble(radEsfera.getText()));
           
           
        resultado.setText("El Volumen de la esfera es: "+ radio );
      }
    
    @FXML
    private void calcularTextoSuper (ActionEvent event){
        etiquetaCambio.setText("Solucion Superficie Esfera.");
        Esfera r = new Esfera();
        Double radio = r.superficie(Double.parseDouble(radEsfera.getText()));
           
           
        resultado.setText("La Superficie de la esfera es: "+ radio );
      }
       
    @FXML
    private void calcularTextoArea (ActionEvent event){
        etiquetaCambio.setText("Solucion Área del circulo.");
        Esfera r = new Esfera();
        Double radio = r.areaCirculo(Double.parseDouble(radCirculo.getText()));
           
           
        resultado.setText("El Área del circulo es: "+ radio );
      }
       
    @FXML
    private void calcularTextoPer (ActionEvent event){
        etiquetaCambio.setText("Solucion Perímetro del circulo.");
        Esfera r = new Esfera();
        Double radio = r.perimetroCirculo(Double.parseDouble(radCirculo.getText()));
           
           
        resultado.setText("El Perímetro del circulo es: "+ radio );
      }
  
       
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    
  
    @FXML
    private void radio(ActionEvent event) {
    }

   
   

    
   
}
