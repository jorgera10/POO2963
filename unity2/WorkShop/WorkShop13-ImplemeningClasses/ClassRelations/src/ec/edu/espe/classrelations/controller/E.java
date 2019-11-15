/** Copyright ESPE-DECC
 */
package ec.edu.espe.classrelations.controller;

import ec.edu.espe.classrelations.model.B;
import ec.edu.espe.classrelations.model.D;
import static java.awt.PageAttributes.MediaType.B;

/**
 *
 * @author Edison Lascano
 */
public class E {

    private B[] bs = new B[5];
    
    public void m(D d) {
        System.out.println("inside method m of class E , receiving parameter D " + D.class.getName());

        System.out.println("for -->");
        for (int i = 0; i < bs.length; i++) {
            System.out.println("b[" + i + "] --> " + bs[i].toString());
        }

        System.out.println("for each simple");
        int count = 0;
        for (B b : bs) {
            System.out.println(count++);
            System.out.println("item : --> " + b.toString());
        }
        count = 0;

    }
}
