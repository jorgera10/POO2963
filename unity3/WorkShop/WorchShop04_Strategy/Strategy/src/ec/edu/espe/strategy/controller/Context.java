/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.strategy.controller;

import java.util.ArrayList;

/**
 *
 * @author camyt
 */
public class Context {
    Strategy stg;

    public Context(Strategy stg) {
        this.stg = stg;
    }

   
    public void setStrategy(Strategy stg) {
        this.stg = stg;
    }
  
    public void ContextInterface(){
        stg.AlgorithmInterface();
    }

}
