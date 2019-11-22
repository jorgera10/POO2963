package ec.edu.espe.tax;
/**
* TaxLibrary computing class
* @author Mathyws Rodriguez
* @version 0.0.1
* @since 2019-11-21  
*/ 
public class Tax {
    /**
     * This is the tax for products and services stablished by Ecuadorian State
     */
   private static float ivaPercentage = 12.00f;


    public static float computeIva(float base){
        /**
         *It calculates the iva tax
         */
        float iva;
        iva = base*ivaPercentage/100;
        return iva;
      
    }    
}
