/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author VICTOR SERRANO
 */
public class ProfesorMedioTiempo extends Profesor {

    public int HORAS_SEMANALES = 20;

    public ProfesorMedioTiempo(String cedula, String nombres, String apellidos, int horasClase, String carreras) {
        super(cedula, nombres, apellidos, horasClase, carreras);
    }

    
    public int horasCompletarias(int horas) {
        int x = HORAS_SEMANALES-horas;
        return x;
    }
}
