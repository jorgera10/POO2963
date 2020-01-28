/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.composite.controller;

/**
 *
 * @author camyt
 */
public abstract class Component {
    public String name;

    public Component(String name) {
        this.name = name;
    }
    
    abstract public void Operation();
    abstract public void Add(Component component);
    abstract public void Remove(Component component);
    abstract public void GetChild(int child);
    abstract public void Show(int depth);
}
