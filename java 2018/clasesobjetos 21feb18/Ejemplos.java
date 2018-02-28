/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import static ejemplos.Ejemplos.hola;

/**
 *
 * @author sala102
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String mi_primera_variable = "hola mundo";
     System.out.println(mi_primera_variable);
     int num1 ,num2;
     num1=3;
     num2=4;
     num1 =num1 +num2;
    
     System.out.println(num1);
     int num3 ,num4;
     num3=5;
     num4=4;
     num3 =num3 -num4;
     System.out.println(num3);
        int num5 ,num6;
     num5=3;
     num6=4;
     num5 =num5 *num6;
     System.out.println(num5);             
     int num7 ,num8;
     num7=8;
     num8=4;
     num7 =num7 /num8;
     System.out.println(num7);
int cont =0;
System.out.println(cont);
cont++;
System.out.println(cont);
cont--;
suma(8,2);
suma(5,6);
resta(8,2);
resta(5,6);
hola();
metodor();
System.out.println(metodor());
// TODO code application logic here
    }
   
public static void suma(int num1 , int num2 )
{
num1 += num2;
System.out.println(num1);

}
public static void resta(int num1 , int num2 )
{
num1 -= num2;
System.out.println(num1);

}
public static void hola()
{
    
System.out.println("hola");

}
public static String metodor()
{
    
return "retorne la funcion";

}
}
