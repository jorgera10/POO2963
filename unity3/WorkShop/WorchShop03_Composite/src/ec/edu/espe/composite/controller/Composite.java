/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.composite.controller;

import java.util.ArrayList;

/**
 *
 * @author camyt
 */
public class Composite extends Component{
    private ArrayList<Component>  children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }
    @Override
    public void Add(Component component){
        children.add(component);
    }
    @Override
    public void Remove(Component component){
        children.remove(component);
    }
    @Override
    public void GetChild(int child){
        System.out.println("Child: "+child);
    }
    
    public void Operation(){
        
    }
    @Override
    public void Show(int depth)
	{
		System.out.println(name + " nivel: " + depth);
                System.out.println(name + " nivel: " + depth);
		for (int i = 0; i < children.size(); i++)
			children.get(i).Show(depth + 1);
		
	}
    
    
    
}
