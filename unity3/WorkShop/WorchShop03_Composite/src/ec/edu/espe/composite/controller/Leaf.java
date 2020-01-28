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
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }
    public void Add(Component component){
        System.out.println("the leaf cannot be added");
    }
    public void Remove(Component component){
        System.out.println("the leaf cannot be removed");
    }
    public void GetChild(int child){
        System.out.println("> "+ child);
    }
    public void Operation(){
        System.out.println("Operation");
    }
    public void Show(int depth)
	{
		System.out.println('-' + "" + name);
	}
}
