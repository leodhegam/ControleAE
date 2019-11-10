/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author Alyson
 */
public class ControadorUsuario implements Initializable {

    
    @FXML
    private Button botao;

    @FXML
    private Label txtLabel;
    
    @FXML
    private TextField nome;

    @FXML
    private void funcao(ActionEvent event){
        System.out.println("oi");
        txtLabel.setText("ola" + nome.getText());
    }
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
