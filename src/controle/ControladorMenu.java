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
import javafx.scene.control.ToolBar;
import main.Principal;

/**
 * FXML Controller class
 *
 * @author Alyson
 */
public class ControladorMenu implements Initializable {

    @FXML
    private ToolBar menu;

    @FXML
    private Button tbnCAC;

    @FXML
    private Button btnCE;


    @FXML
    void cadastrarAr(ActionEvent event) {
        Principal.changeScreen("cadastroAC");
    }

    @FXML
    void cadastrarE(ActionEvent event) {

    }
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
