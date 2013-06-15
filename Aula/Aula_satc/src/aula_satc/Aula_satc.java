/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_satc;
import java.util.Scanner;
/**
 *
 * @author EDUTEC
 */
public class Aula_satc {
    

 
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe três notas");
            Float n1 = sc.nextFloat();
            Float n2 = sc.nextFloat();
            Float n3 = sc.nextFloat();
            if (n1+n2+n3/3 >= 6) {System.out.println("Aprovado :-)");
        } else {System.out.println("Reprovado :-(");
    
        // TODO code application logic here
    }
        }
}
