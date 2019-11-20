/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import modelo.Extintor;

/**
 *
 * @author Aluno
 */
public class ExtintorDAO {
  private final Conexao con = new Conexao();
  
    private final String LOGIN = "SELECT USUARIO FROM USUARIO  WHERE USUARIO =  ? and  SENHA =  ?";

    
    
    public ArrayList<Extintor> listExtintor(){
        ArrayList<Extintor> lista = new ArrayList<>(); 
        return lista;
    }
    
    
}
