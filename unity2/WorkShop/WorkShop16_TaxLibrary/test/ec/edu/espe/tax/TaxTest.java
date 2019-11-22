/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matitisxd
 */
public class TaxTest {
    
    public TaxTest() {
     
    }
    @Test
     public void testComputeIva(){
        float base=10;
        float expectedValue=1.2f;
        float actualValue=0f;
        actualValue=Tax.computeIva(base);
        
        assertEquals(expectedValue, actualValue,10);
        
    }
    @Test
    public void testComputeIvaDecimals(){
        float base=50388.37f;
        float expectedValue=6046.6044f;
        float actualValue=0f;
        actualValue=Tax.computeIva(base);
        
        assertEquals(expectedValue, actualValue,2);
    }
}
