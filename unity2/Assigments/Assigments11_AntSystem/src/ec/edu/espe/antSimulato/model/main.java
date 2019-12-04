/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antSimulato.model;

import ec.edu.espe.antSimulato.controller.Ant;
import ec.edu.espe.antSimulato.controller.AntEater;
import ec.edu.espe.antSimulato.controller.Area;
import ec.edu.espe.antSimulato.controller.Cell;
import ec.edu.espe.antSimulato.controller.Colony;
import ec.edu.espe.antSimulato.controller.PheromoneDrop;

/**
 *
 * @author STALIN RIVERA y JORGE RAMOS
 */
public class main {
    
    public static void main(String[] args){
    Cell x = new Cell();
    Colony y = new Colony();
    PheromoneDrop z = new PheromoneDrop();
    AntEater t = new AntEater();
    x.GetAnts() ;
    y.Run();
    z.run();
    t.Run();
    }
}