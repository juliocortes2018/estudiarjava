/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.herencia.docente;

/**
 *
 * @author ANDRESYANDREA
 */
public class ClaseHerenciaDocente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Profesor profesor1 = new Profesor ("Julio Andres", "Cortes Borray", 31);
        profesor1.setIdProfesor("Prof 22-387-09");
        profesor1.mostrarNombreApellidosYCarnet();}
}