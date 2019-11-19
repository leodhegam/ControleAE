/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import main.Principal;

/**
 * FXML Controller class
 *
 * @author Alyson
 */
public class ControladorLogin implements Initializable {

    @FXML
    private Label txtLabel;

    @FXML
    private Pane pane;

    @FXML
    private TextField txtUsuario;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnCadastro;

    @FXML
    void cadastrar(ActionEvent event) {
        Principal.changeScreen("cadastro");
    }

    @FXML
    void login(ActionEvent event) {
       //   Principal.changeScreen("menu");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
