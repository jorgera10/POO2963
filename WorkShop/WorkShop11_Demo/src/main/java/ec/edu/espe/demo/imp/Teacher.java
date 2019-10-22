package ec.edu.espe.demo.imp;

import ec.edu.espe.demo.dao.IPerson;;

public class Teacher implements IPerson{

    @Override
    public String sayHello() {
        
        return "Hola soy un PROFESOR";
    }

    


}