/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author Lenovo
 */
public abstract class ClaseAbstracta
{
     public int obtener( int num )
    {
        this.mensaje();
         int numero = this.multiplicar( num );
         numero = this.sumar( numero );
        return numero;
    }
    // -------------------
    public void mensaje()
    {
        System.out.println("Vamos a realizar las operaciones...");
    }
  
     public abstract int multiplicar( int num );
     public abstract int sumar(  int num  );
}
