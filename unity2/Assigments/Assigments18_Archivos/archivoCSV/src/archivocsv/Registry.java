/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivocsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camyt
 */
public class Registry {

   
    public AddData addRegistry() {
        AddData addData = new AddData();
   
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrse id: ");
        addData.setId(Integer.parseInt(in.nextLine()));
       
        System.out.println("Ingrese nombre: ");
        addData.setName(in.nextLine());
        System.out.println("Ingrese apellido: ");
        addData.setLastName(in.nextLine());
        System.out.println("Ingrese edad: ");
        addData.setAge(Integer.parseInt(in.nextLine()));
       
       

        return addData;
    }

    public void file(AddData addData) {
        try{
        File f = new File("Registry.csv");
        FileWriter fw;
        BufferedWriter bw;
        if (f.exists()) {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(addData.getId()+";"+addData.getName()+";"+addData.getLastName()+";"+addData.getAge());

        } else {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(addData.getId()+";"+addData.getName()+";"+addData.getLastName()+";"+addData.getAge());
        }
        bw.close();
        }
        catch(IOException e){
            
        }
    }
       
      
    public ArrayList<AddData> readRegistry(){
        
        ArrayList<AddData> addDatas = new ArrayList<AddData>();
           
        try{
            File f=new File("Registry.csv");
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null)
                {
                    AddData data = new AddData();
                    String[] contact = line.split(";");
                    
                    data.setId(Integer.parseInt(contact[0]));
                    data.setName(contact[1]);
                    data.setLastName(contact[2]);
                    data.setAge(Integer.parseInt(contact[3]));
                    
            
                    addDatas.add(data);
                }
                br.close();
            
            }
        }catch(Exception e){
            System.out.println(e);}
        
        return addDatas;
    }
     public AddData searchData(int id){
        ArrayList<AddData> arrData = new ArrayList<AddData>();
        AddData data = new AddData();
        arrData = readRegistry();
        for (int i = 0; i < arrData.size(); i++) {
            if (arrData.get(i).getId() == id) {              
                data =  arrData.get(i);
                System.out.println(data);
            }
        }
        return data;
    }
    
    public void upgradeData( ArrayList<AddData> arrDa){
        File f=new File("Registry.csv");
        f.delete();
        for (int i = 0; i < arrDa.size(); i++) {
            file(arrDa.get(i));
        }
    }
    

}
