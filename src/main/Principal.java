package main;

import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Principal extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    private static Stage stage;

    private static Scene login;
    private static Scene cadastro;
    private static Scene menu;
    private static Scene cadastroAC;

    @Override
    public void start(Stage stageP) throws Exception {
        stage = stageP;
        stageP.setTitle("Login");

        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("/visao/Login.fxml"));
        login = new Scene(fxmlLogin, 640, 400);

        Parent fxmlCadastro = FXMLLoader.load(getClass().getResource("/visao/CadastroUsuario.fxml"));
        cadastro = new Scene(fxmlCadastro, 640, 400);

        Parent fxmlMenu = FXMLLoader.load(getClass().getResource("/visao/Menu.fxml"));
        menu = new Scene(fxmlMenu, 640, 400);

        Parent fxmlCadastroAC = FXMLLoader.load(getClass().getResource("/visao/CadastroAC.fxml"));
        cadastroAC = new Scene(fxmlCadastro, 640, 400);

        stageP.setScene(login);
        stageP.show();
    }

    public static void changeScreen(String tela) {
        switch (tela) {
            case "login":
                stage.setScene(login);
                break;
            case "cadastro":
                stage.setScene(cadastro);
                break;
            case "menu":
                stage.setScene(menu);
                break;
            case "cadastroAC":
                stage.setScene(cadastroAC);
                break;

        }
    }

}
