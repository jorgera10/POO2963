
package ec.edu.espe;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Semana {
    public static void main(String[] args){
        
        String dia;
        
        Scanner enter = new Scanner(System.in);
        System.out.println("Digite un dia de la semana: ");
        dia = enter.next();
        
        DiasSemana Dias = DiasSemana.valueOf(dia);
        
        switch (Dias){
            case lunes:
            case martes:
            case miercoles:
            case jueves:
            case viernes:
                System.out.println("El dia " +Dias+ " es laboral");
                break;
                
            case sabado:
            case domingo:
                System.out.println("El dia " +Dias+ " no es laboral");
                break;
            
        }
        
    }
}
