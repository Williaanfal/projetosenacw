/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador.jbdc;
import javax.swing.JOptionPane;
/**
 *
 * @author willian.falcao
 */
public class TestaConexao {
    public static void main(String[] args) {
        try {
            ConnectionFactory.getConnection();
            JOptionPane.showMessageDialog(null, "CONEXÃO BEM SUCEDIDA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
