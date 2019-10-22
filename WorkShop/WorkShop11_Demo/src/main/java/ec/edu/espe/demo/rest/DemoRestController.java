
     
package ec.edu.espe.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.demo.dao.IPerson;
import ec.edu.espe.demo.imp.Student;
import ec.edu.espe.demo.imp.Teacher;

@RestController
@RequestMapping("api/demo")
public class DemoRestController {
    IPerson person = new Student();
    IPerson person2 = new Teacher();

    @GetMapping("/student")
    public String getStudent(){
        return person.sayHello();
    }
    
    @GetMapping("/teacher")
    public String getTeacher(){
        return person2.sayHello();
    }



/*@RestController
@RequestMapping("api/demo")
public class DemoRestController {

    @GetMapping
    public String hello() {
        return "Hello World, i am rest service";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Good bye see you later";
    }

    @GetMapping(value = "/callme/{name}/{age}/{dni}")
    public Person dni(@PathVariable String name, @PathVariable int age, @PathVariable String dni) {
        int x = validation(dni);
        if (x == 1) {
            return new Person(name, age, dni + " Dni correct");
        } else
            return new Person(name, age, dni + " Dni incorrect");

    }

    public int validation(@PathVariable String dni) {

        String pr0 = String.valueOf(dni.charAt(0));
        String pr1 = String.valueOf(dni.charAt(1));
        String pr2 = String.valueOf(dni.charAt(2));
        int pr = Integer.parseInt(pr0 + pr1);
        int suma = 0;
        int last_digit = 0;

        if (pr < 1 || pr > 24) {
            return 0;
        }
        pr = Integer.parseInt(pr2);
        if (pr > 6) {
            return 0;
        }

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                suma += Integer.parseInt(String.valueOf(dni.charAt(i - 1)));
            } else {
                if (Integer.parseInt(String.valueOf(dni.charAt(i - 1))) * 2 > 9) {
                    suma += Integer.parseInt(String.valueOf(dni.charAt(i - 1))) * 2 - 9;
                } else {
                    suma += Integer.parseInt(String.valueOf(dni.charAt(i - 1))) * 2;
                }
            }
        }
        
        
        last_digit = (((suma / 10) + 1) * 10) - suma;
        if(last_digit == 10){
            last_digit = 0;
        }

        if (last_digit != Integer.parseInt(String.valueOf(dni.charAt(9)))) {
            return 0;
        } else {
            return 1;
        }

    }

    @PostMapping
    public Person person(@RequestBody Person per){
        per.setAge(50);
        return per;*/
    


}
    



