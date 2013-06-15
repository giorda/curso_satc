/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_satc;
import javax.swing.JOptionPane;

public class media_joption {
    public static void main (String[]arg) {
        String n1,n2,n3 = "";
        n1 = JOptionPane.showInputDialog("Informe três notas, nota 1:");
        n2 = JOptionPane.showInputDialog("Nota 2:");
        n3 = JOptionPane.showInputDialog("Nota 3:");
        Float.parseFloat(n1);
        Float.parseFloat(n2);
        Float.parseFloat(n3);
        if (((n1+n2+n3)/3) >= 6) {String msg = "Aprovado :-)";
            JOptionPane.showMessageDialog(null, msg);
        }
        } else {msg "Reprovado :-(";
            JOptionPane.showMessageDialog(null, msg);
        
        
        
           
    }
            
    
}
