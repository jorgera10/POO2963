/** Copyright ESPE-DECC
*/

package ec.edu.espe.classrelations.controller;

import ec.edu.espe.classrelations.model.B;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Edison Lascano
 */
public class C {
    private ArrayList<B> bs = new ArrayList<>();
    
    public void m(E e){
        
        B b;
        for (int i = 0; i <=3;i++){
            b = new B();
            bs.add(b);
        }
        
        
        System.out.println("I am a method m inside an object " + C.class.getCanonicalName() + " and I receive an argument of type " + e.getClass().getSimpleName());
        System.out.println("my bs size is " + bs.size());

        System.out.println("ArrayList forEach -->");
        bs.forEach((n) -> System.out.println(n));
        
        System.out.println("while --> ");
        int i=0;
        while(i < bs.size()){
            System.out.println("item --> " + bs.get(i++));
            //i++;
        }
        
        
        System.out.println("Iterator --> ");
        Iterator bsIterator  = bs.iterator();
        while(bsIterator.hasNext()) {
            System.out.println("item: " + bsIterator.next());
        }
    }
    

}
