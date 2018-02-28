/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesobjetos;



/**
 *
 * @author sala104
 */
public class Clasesobjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         
       
        clasepersona obj1 = new clasepersona();
        obj1.setNombre ("julio");
        obj1.setApellido ("cortes");
        obj1.setEdad (31);
        
        System.out.println(obj1.getNombre());
        System.out.println(obj1.getApellido());
        System.out.println(obj1.getEdad());
        
        estudiante obj2 = new estudiante();
        obj2.setNombre ("wilmer");
        obj2.setApellido ("neuta");
        obj2.setEstudiante ("sistemas");
        obj2.setEdad (25);
        obj2.setSemestre (2);
        
        System.out.println(obj2.getNombre());
        System.out.println(obj2.getApellido());
        System.out.println(obj2.getEstudiante());
        System.out.println(obj2.getEdad());
        System.out.println(obj2.getSemestre());
        
    


// TODO code application logic here
    }
    
}
