package ec.edu.espe.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.demo.util.Person;

@RestController
@RequestMapping("api/demo")
public class DemoRestController{


    @GetMapping
    public String hello(){
        return "Hola mundo, soy el servicio rest";
    }
    
    @GetMapping("/godBye")
    public String goodBye(){
        return "ADIOS!!!!!!!!!!!!!!";
    }

    /*@GetMapping(value = "/callme/{edad}")
    public String name(@PathVariable String name){
        return "Hola, mucho gusto " + name;
    }*/

    
    @GetMapping(value = "/callme/{name}/{age}")
    public Person name(@PathVariable String name, @PathVariable int age){
        return new Person(name, age);
    }

} 