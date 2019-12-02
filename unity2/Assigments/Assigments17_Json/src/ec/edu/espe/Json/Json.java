
package ec.edu.espe.Json;

import ec.edu.espe.business.B_User;
import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.JSONArray;

/**
 *
 * @author Lenovo
 */
public class Json {
    
    public static void main(String[] args){
        B_User buser = new B_User();
        JSONArray array = new JSONArray();
        array = buser.arrayUsers();
        
        StringWriter out = new StringWriter();
        try{
            array.writeJSONString(out);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(out);
    }
    
}
