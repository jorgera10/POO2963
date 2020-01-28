/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractfactory;



/**
 *
 * @author Dennisiin
 */
public class AbstractFactory {

    public static void main(String[] args) {
        ProductA1 product = new ProductA1();
        product.ProductA1();
        ProductA2 product1 = new ProductA2();
        product1.ProductA2();
        
        AbstractProductA productA;
        productA = new AbstractProductA();
//        ProductA1 productA1 = productA.CreateProductA();
        System.out.println("Connecting with "+product);
        
    }
    
}
