/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author VICTOR SERRANO
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        ListaProfesores lista = new ListaProfesores();
        
        int opc = 0;
        while (opc < 4) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Crear Profesor Tiempo Parcial\n2. Crear Profesor medio tiempo\n3. Crear Profesor tiempo completo\n4. Salir"));
            switch (opc) {
                case 1:
                    String cedula = JOptionPane.showInputDialog(null, "Cedula");
                    String nombres = JOptionPane.showInputDialog(null, "nombres");
                    String apellidos = JOptionPane.showInputDialog(null, "apellidos");
                    int horasClase=0;
                    while (horasClase<1 ||horasClase>10) {                        
                        horasClase = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas clase","Entre 2 y 9"));
                    }
                    int horasSemanales=0;
                    while (horasSemanales<1 ||horasSemanales>20) {                        
                        horasSemanales = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas clase","Entre 2 y 20"));
                    }
                    String carreras = JOptionPane.showInputDialog(null, "carreras");
                    ProfesorTiempoParcial ptp = new ProfesorTiempoParcial(horasSemanales, cedula, nombres, apellidos, horasClase, carreras);
                    
                    lista.agregar(ptp);
                    lista.grabar();
                    break;
                case 2:
                    String cedula2 = JOptionPane.showInputDialog(null, "Cedula");
                    String nombres2 = JOptionPane.showInputDialog(null, "nombres");
                    String apellidos2 = JOptionPane.showInputDialog(null, "Apellidos");
                    int horasClase2 = 10;
                    String carreras2 = JOptionPane.showInputDialog(null, "Carreras");
                    ProfesorMedioTiempo pmt = new ProfesorMedioTiempo(cedula2, nombres2, apellidos2, horasClase2, carreras2);
                    lista.agregar(pmt);
                    lista.grabar();
                    break;
                case 3:
                    String cedula3 = JOptionPane.showInputDialog(null, "Cedula");
                    String nombres3 = JOptionPane.showInputDialog(null, "nombres");
                    String apellidos3 = JOptionPane.showInputDialog(null, "Apellidos");
                    int horasClase3=0;
                    while (horasClase3<2 ||horasClase3>16) {                        
                        horasClase3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas clase","Entre 3 y 16"));
                    }
                     
                    String carreras3 = JOptionPane.showInputDialog(null, "Carreras");
                    ProfesorTiempoCompleto ptc = new ProfesorTiempoCompleto(cedula3, nombres3, apellidos3, horasClase3, carreras3);
                    lista.agregar(ptc);
                    lista.grabar();
                    break;

            }
        }
    }
}
