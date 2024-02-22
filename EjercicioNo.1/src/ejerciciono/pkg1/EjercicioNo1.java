/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciono.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class EjercicioNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String lecturacurso;
        int cursos;
        
        lecturacurso = JOptionPane.showInputDialog("Cuantos cursos desea incluir?");
        cursos = Integer.parseInt(lecturacurso);
        
        double totalpagohacienda = 0;
        double montocurso;
        
        for (int i = 1; i<= cursos; i++){
            lecturacurso = JOptionPane.showInputDialog("Cual es el monto a pagar del curso?");
            montocurso = Double.parseDouble(lecturacurso);
            System.out.println(" curso" + i + ": " + montocurso);
            
            double pagohacienda = montocurso + (montocurso*2/100);
            System.out.println("pago hacienda 2%: "+ pagohacienda);  
            
            totalpagohacienda= totalpagohacienda+pagohacienda;
        }
        System.out.println("El profesor Walter White deberá pagar a hacienda el monto de:"+ totalpagohacienda);
        
    }
    
}
