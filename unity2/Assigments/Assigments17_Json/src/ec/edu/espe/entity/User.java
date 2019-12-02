
package ec.edu.espe.entity;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;
/**
 *
 * @author Lenovo
 */
public class User implements JSONStreamAwere  {
    private int id;
    private String user;
    private String password;

    public User(int id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     *
     * @param out
     */
    public void WriteJSONString(Writer out) throws IOException{
        LinkedHashMap obj = new  LinkedHashMap();
        obj.put("id", String.valueOf(id));
        obj.put("Username ", user);
        obj.put("Password ", password);
        JSONValue.writeJSONString(obj, out);
        
    }
}
