
package controle;

import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import main.Principal;
import modelo.ArCondicionado;
import persistencia.ArCondicionadoDAO;
import persistencia.ExtintorDAO;
/**
 * FXML Controller class
 *
 * @author Leonardo
 */


public class ControladorAc implements Initializable {
 private ArCondicionadoDAO arCDAO = new ArCondicionadoDAO();
    private ArCondicionado arCEdit = new ArCondicionado();
    private ObservableList<ArCondicionado> arCondicionado = FXCollections.observableArrayList();
    
    public ArrayList<ArCondicionado> listArCondicionado() {
        ArrayList<ArCondicionado> lista = new ArrayList<>();
		
        return lista;
        }
    @FXML
    private TableView<ArCondicionado> tabela;

    @FXML
    private TableColumn<ArCondicionado, ?> colunaModelo;

    @FXML
    private TableColumn<ArCondicionado, ?> colunaFabricacao;

    @FXML
    private TableColumn<ArCondicionado, ?> colunaSetor;

    @FXML
    private TableColumn<ArCondicionado, ?> colunaValidade;

    @FXML
    private TableColumn<ArCondicionado, ?> colunaDespesas;

    @FXML
    private Button lblVoltar;

    @FXML
    private Button lblCadastro;

    @FXML
    private Button lblBuscar;
@FXML
    void buscar(ActionEvent event) {

		arCondicionado.clear();
		ArCondicionado a = (ArCondicionado) tabela.getSelectionModel().getSelectedItem();
		tabela.setItems(arCondicionado);
		colunaModelo.setCellValueFactory(new PropertyValueFactory<>(" colunaModelo"));
                colunaFabricacao.setCellValueFactory(new PropertyValueFactory<>(" colunaFabricacao"));
                colunaSetor.setCellValueFactory(new PropertyValueFactory<>(" colunaSetor"));
                colunaValidade.setCellValueFactory(new PropertyValueFactory<>(" colunaValidade"));
                colunaDespesas.setCellValueFactory(new PropertyValueFactory<>("colunaDespesas"));
		tabela.getSortOrder().add(colunaModelo);
	
    }

    @FXML
    void cadastrar(ActionEvent event) {
        Principal.changeScreen("CAR");
    }

    @FXML
    void voltar(ActionEvent event) {
        Principal.changeScreen("menu");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        colunaModelo.setCellValueFactory(new PropertyValueFactory<>(" colunaModelo"));
                colunaFabricacao.setCellValueFactory(new PropertyValueFactory<>(" colunaFabricacao"));
                colunaSetor.setCellValueFactory(new PropertyValueFactory<>(" colunaSetor"));
                colunaValidade.setCellValueFactory(new PropertyValueFactory<>(" colunaValidade"));
                colunaDespesas.setCellValueFactory(new PropertyValueFactory<>("colunaDespesas"));
		tabela.getSortOrder().add(colunaModelo);
        refreshTabela();
        
        arCondicionado.addAll(arCDAO.listArC());
       tabela.setItems(FXCollections.observableArrayList(arCondicionado));
       
        FilteredList<ArCondicionado> filteredData = new FilteredList<>(arCondicionado, p -> true);

        colunaModelo.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(tipo -> {
                // If filter text is empty, display all users.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                if (tipo.getModelo().toUpperCase().contains(newValue.toUpperCase())) {
                    return true;
                }
                return false;
            });
            tabela.setItems(filteredData);
        });
        tabela.setOnMouseClicked(event -> {
            arCEdit = tabela.getSelectionModel().getSelectedItem();
            colunaModelo.setText(arCEdit.getModelo());
            colunaFabricacao.setText(String.valueOf(arCEdit.getDatafabricacao()));
            colunaSetor.setText(arCEdit.getSetor());
            colunaDespesas.setText(String.valueOf(arCEdit.getDespesas()));
        });

    }

    private void refreshTabela() {
        arCondicionado.clear();
        arCondicionado.addAll(arCDAO.listArC());
        tabela.setItems(arCondicionado);
    }
    /*
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    TODO
    }*/ 

    

}

    
