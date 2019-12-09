/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.mdd;

/**
 *
 * @author HP
 */
public abstract class C {
    
    private D d;
    private E e;

    public C() {
    }

    public C(D d, E e) {
        this.d = d;
        this.e = e;
    }

    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
    
    public abstract void print();

    @Override
    public String toString() {
        return "C{" + "d=" + d + ", e=" + e + '}';
    }
    
    
    
}
