package ec.edu.espe.demo.imp;

import ec.edu.espe.demo.dao.IPerson;

public class Student implements IPerson{

    @Override
    public String sayHello() {
        return "Hola soy un ESTUDIANTE";
    }
    
}

