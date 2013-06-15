/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_satc;

/**
 *
 * @author EDUTEC
 */
public class ArrayDoWhile {
           public static void main(String[] args){
        String days[] = {"Monday","Tuesday","Wednesday","Tursday", "Friday",
            "Saturday","Sunday"};
        Integer i = 0;
        do {
            System.out.println(days[i]);
            i++;
        }       
            while (i < days.length);    
        }
}
    

