
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ArCondicionado;
import modelo.Extintor;

/**
 *
 * @author Leonardo
 */
public class ArCondicionadoDAO {
      private final Conexao con = new Conexao();

    private final String INSERTARC = "INSERT INTO ARCONDICIONADO (FABRICANTE,DATAFABRICACAO,DESPESAS,MODELO,SETOR, ID_USUARIO) VALUES (?, ?, ?, ?, ?,?)";
        private final String LISTARC = "SELECT * FROM ARCONDICIONADO";
       
    public boolean insertArC(ArCondicionado a) {
        try {
            // CONECTA
            con.conecta();

            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERTARC);
//(FABRICANTE,DATAFABRICACAO,DESPESAS,MODELO,SETOR, ID_USUARIO) VALUES (?, ?, ?, ?, ?,?)";
            // SETA OS VALORES DA INSTRUCAO
            // OBS: PASSA OS PARAMETROS NA ORDEM DAS ? DA INSTRUCAO
            preparaInstrucao.setString(1,a.getFabricante().toUpperCase());
            preparaInstrucao.setDate(2,a.getDatafabricacao());
            preparaInstrucao.setInt(3, a.getDespesas());
            preparaInstrucao.setString(4, a.getModelo().toUpperCase());
            preparaInstrucao.setString(5,a.getSetor().toUpperCase());
            preparaInstrucao.setInt(5, 1);

            // EXECUTA A INSTRUCAO
            preparaInstrucao.execute();

            // DESCONECTA
            con.desconecta();

            return true;

        } catch (SQLException erro) {
            return false;

        }
    }

   public ArrayList<ArCondicionado> listArC() {
		ArrayList<ArCondicionado> lista = new ArrayList<>(); 
		
		try {
			// CONECTA
			con.conecta();
			PreparedStatement preparaInstrucao;
			preparaInstrucao = con.getConexao().prepareStatement(LISTARC); 
			
			
			// EXECUTA A INSTRUCAO
			ResultSet rs = preparaInstrucao.executeQuery(); 
			
			//TRATA O RETORNO DA CONSULTA
			while (rs.next()) { //enquanto houver registro
				ArCondicionado a = new ArCondicionado(rs.getString("MODELO"),rs.getString("SETOR"),rs.getInt("DESPESAS"),rs.getInt("ID_ARCONDICIONADO"),rs.getDate("DATAFABRICACAO"));
                        	lista.add(a); 
			}
			// DESCONECTA
			con.desconecta();
		} catch (SQLException sqle) {
                    System.out.println(sqle.getMessage());
		}
		
		return lista;
	}

}

