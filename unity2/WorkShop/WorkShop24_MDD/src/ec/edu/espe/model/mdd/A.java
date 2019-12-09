/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.mdd;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class A {
    
    private B[] bArray = new B[3];
    private ArrayList<F> fList = new ArrayList<>();
    private ArrayList<G> gList = new ArrayList<>();
    private ArrayList<H> hList = new ArrayList<>();

    @Override
    public String toString() {
        return "A{" + "bArray=" + bArray + ", fList=" + fList + ", gList=" + gList + ", hList=" + hList + '}';
    }

    public A() {
        this.bArray=bArray;
        this.fList=fList;
        this.gList=gList;
        this.hList=hList;
    }



    
}
