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
import main.Principal;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class ControladorMenu implements Initializable {

    @FXML
    private Button btnAr;

    @FXML
    private Button btnEx;

    @FXML
    private Button btnSair;

    @FXML
    void arCondicionado(ActionEvent event) {
        Principal.changeScreen("ar");
    }

    @FXML
    void extintor(ActionEvent event) {
        Principal.changeScreen("ex");
    }

    @FXML
    void sair(ActionEvent event) {
        Principal.changeScreen("login");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
