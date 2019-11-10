package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import modelo.Usuario;

public class UsuarioDAO {

    private final Conexao con = new Conexao();
    private final String INSERTUSUARIO = "INSERT INTO USUARIO (NOME, EMAIL, FUNCACAO, USUARIO, SENHA ) VALUES (?,?,?,?,?)";
    private final String UPDATEUSUARIO = "UPDATE USUARIO SET NOME = ?, EMAIL = ?, FUNCACAO = ?, USUARIO = ?, SENHA = ?  WHERE ID_USUARIO = ?";
    private final String DELETEUSUARIO = "DELETE FROM USUARIO WHERE ID_USUARIO = ?";
    private final String LISTUSUARIO = "SELECT * FROM USUARIO";
    private final String BUSCARUSUARIO = "SELECT * FROM USUARIO WHERE UPPER(NOME) LIKE ?";

    public boolean insertUsuario(Usuario u) {
        try {
            // CONECTA
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERTUSUARIO);

            // SETA OS VALORES DA INSTRUCAO
            // OBS: PASSA OS PARAMETROS NA ORDEM DAS ? DA INSTRUCAO
            preparaInstrucao.setString(1, u.getNome().toUpperCase());
            preparaInstrucao.setString(2, u.getEmail().toUpperCase());
            preparaInstrucao.setString(3, u.getFuncacao().toUpperCase());
            preparaInstrucao.setString(4, u.getLogin());
            preparaInstrucao.setInt(5, u.getSenha());

            // EXECUTA A INSTRUCAO
            preparaInstrucao.execute();

            // DESCONECTA
            con.desconecta();

            return true;

        } catch (SQLException e) {
            return false;

        }
    }

    public boolean updateUsuario(Usuario u) {
        try {
            // CONECTA
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(UPDATEUSUARIO);

            // SETA OS VALORES DA INSTRUCAO
            // OBS: PASSA OS PARAMETROS NA ORDEM DAS ? DA INSTRUCAO
            preparaInstrucao.setString(1, u.getNome().toUpperCase());
            preparaInstrucao.setString(2, u.getEmail().toUpperCase());
            preparaInstrucao.setString(3, u.getFuncacao().toUpperCase());
            preparaInstrucao.setString(4, u.getLogin());
            preparaInstrucao.setInt(5, u.getSenha());
            preparaInstrucao.setInt(6, u.getIdUsuario());

            // EXECUTA A INSTRUCAO
            preparaInstrucao.execute();

            // DESCONECTA
            con.desconecta();

            return true;

        } catch (SQLException e) {
            return false;

        }
    }

    public boolean deleteUsuario(int idUsuario) {
        try {
            // CONECTA
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(DELETEUSUARIO);

            // SETA OS VALORES DA INSTRUCAO
            // OBS: PASSA OS PARAMETROS NA ORDEM DAS ? DA INSTRUCAO
            preparaInstrucao.setInt(1, idUsuario);

            // EXECUTA A INSTRUCAO
            preparaInstrucao.execute();

            // DESCONECTA
            con.desconecta();

            return true;

        } catch (SQLException e) {
            return false;

        }
    }
}
