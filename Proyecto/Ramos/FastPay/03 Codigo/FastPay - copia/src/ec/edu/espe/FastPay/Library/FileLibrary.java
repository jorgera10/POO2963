/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.Library;




import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class FileLibrary {
    static Gson gson=new Gson();
    
   
    
    
    
    public static void addToFile(Object object){
        JsonArray jArray = new JsonArray();
        String jsonStringFile;
        try {
            File f=new File(object.getClass().getSimpleName()+".json");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()){
                ArrayList<Object> objects = readObjects(object.getClass().getSimpleName());
                objects.add(object);
                for(int i=0;i<objects.size();i++){
                    String jsonString = gson.toJson(objects.get(i));
                    JsonElement jElement = gson.fromJson(jsonString, JsonElement.class);
                    jArray.add(jElement);
                    
                }
                jsonStringFile = gson.toJson(jArray);
                fw=new FileWriter(f, false);
                              
                
                
                
            }else{
                String jsonString = gson.toJson(object);
                JsonElement jElement = gson.fromJson(jsonString,JsonElement.class);
                jArray.add(jElement);
                jsonStringFile = gson.toJson(jArray);
                fw=new FileWriter(f, true);
            }
            bw=new BufferedWriter(fw);
            bw.write(jsonStringFile);
            bw.flush();
            bw.close();
            
            
        } catch (Exception e) {
        }
    }
    public static ArrayList<Object> readObjects(String nameClass){
        JsonParser parser = new JsonParser();
        ArrayList<Object> objects = new ArrayList<>();
        try {
            File f=new File(nameClass+".json");
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                JsonElement dates = parser.parse(fr);
                JsonArray jArray = dates.getAsJsonArray();
                for(int i=0;i<jArray.size();i++){
                    String jString = jArray.get(i).getAsJsonObject().toString();
                    Object object = gson.fromJson(jString, Object.class);
                    objects.add(object);
                }
                fr.close();
                
            }
            
        } catch (Exception e) {
            System.out.println("The archive not find");
            return objects;
        }
        return null;
    }

    public static ArrayList<Object> readyObject(String simpleName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
