package controle;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import main.Principal;
import modelo.ArCondicionado;
import modelo.Extintor;
import persistencia.ArCondicionadoDAO;
import persistencia.ExtintorDAO;

public class CadastroArCondicionado {
  private ArCondicionadoDAO ArCondicionadoDAO = new ArCondicionadoDAO();
    @FXML
    private TextField lblDespesas;

    @FXML
    private TextField lblSetor;

    @FXML
    private TextField lblModelo;

    @FXML
    private DatePicker DateFabricacao;

    @FXML
    private TextField lblFabricante;

    @FXML
    private Button BtnSalvar;

    @FXML
    private Button BtnVoltar;
 @FXML
    void salvar(ActionEvent event) {
        ArCondicionado a = new ArCondicionado(String.valueOf(lblModelo.getText()),lblSetor.getText(),Integer.parseInt(lblDespesas.getText()),1,lblFabricante.getText(),Date.valueOf(DateFabricacao.getValue()));
        ArCondicionadoDAO.insertArC(a);
           
     
        Principal.changeScreen("ar");
    }
         @FXML
    void buscar(ActionEvent event) {

    }

    @FXML
    void cadastrar(ActionEvent event) {
        Principal.changeScreen("CAR");
      
    }
   
    @FXML
    void voltar(ActionEvent event) {
        Principal.changeScreen("ar");
    }
   

}
