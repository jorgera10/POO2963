/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.strategy.view;

import ec.edu.espe.strategy.controller.ConcreteStrategyA;
import ec.edu.espe.strategy.controller.ConcreteStrategyB;
import ec.edu.espe.strategy.controller.ConcreteStrategyC;
import ec.edu.espe.strategy.controller.Context;
import ec.edu.espe.strategy.controller.Strategy;

/**
 *
 * @author camyt
 */
public class Client {
    
     public static void main(String args[]){
         Strategy strategyA = new ConcreteStrategyA();
         Context context = new Context(strategyA);
         context.ContextInterface();
         
         Strategy strategyB = new ConcreteStrategyB();
         context.setStrategy(strategyB);
         context.ContextInterface();
         
         Strategy strategyC = new ConcreteStrategyC();
         context.setStrategy(strategyC);
         context.ContextInterface();
         
         
         
     }
    
    
}
