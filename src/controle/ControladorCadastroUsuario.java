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
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import main.Principal;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class ControladorCadastroUsuario implements Initializable {

    @FXML
    private TextField lblNome;

    @FXML
    private TextField lblLogin;

    @FXML
    private TextField lblEmail;

    @FXML
    private TextField lblFuncao;

    @FXML
    private TextField lblSenha;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnLimpar;

    @FXML
    private Pane pane;

    @FXML
    void cadastrarUsuario(ActionEvent event) {
        Principal.changeScreen("login");
    }

    @FXML
    void limpar(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
