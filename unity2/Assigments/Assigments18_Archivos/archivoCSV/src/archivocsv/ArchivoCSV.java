/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivocsv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author camyt
 */
public class ArchivoCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Registry registry = new Registry();
        int op;
        boolean ext = false;
        while(!ext){

        System.out.println("1. Ingresar datos");
        System.out.println("2. Mostrar datos");
        System.out.println("3. Borrar el archivo completo");
        System.out.println("4. Modificar");
        System.out.println("5. Salir");
      
        op = in.nextInt();
        switch(op){
            case 1:
                AddData addData = new AddData();
                addData = registry.addRegistry();
                registry.file(addData);
                break;
            case 2:
                List<AddData> arrData = new ArrayList<>();
                arrData = registry.readRegistry();
                System.out.println(Arrays.toString(arrData.toArray()));
                break;
            case 3:
                ArrayList<AddData> arrDatas = new ArrayList<AddData>();
                registry.upgradeData(arrDatas);
                break;
            case 4:
                AddData addDat = new AddData();
                System.out.println("Ingrese id que quiere modificar ");
                int id = in.nextInt();
                addDat=registry.searchData(id);
                
                break;
            case 5:
                ext = true;
                break;
        }
        }
        
        
        
    }
    
}
