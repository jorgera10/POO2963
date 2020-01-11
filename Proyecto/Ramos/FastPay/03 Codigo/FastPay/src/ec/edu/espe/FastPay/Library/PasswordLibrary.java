package ec.edu.espe.FastPay.Library;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PasswordLibrary {
    public static String encryptPass(String password) {
        String encryptPass="";
        String passInv = "";
        
        for (int i = password.length()-1 ; i >= 0 ; i--) {
            passInv = passInv +password.charAt(i);
        }
        System.out.println(passInv);
        
        for (int i = 0; i < password.length(); i++) {
            int value = passInv.codePointAt(i);
            if(value%2 == 0){
               encryptPass = encryptPass + (char) (value+Math.pow(2, i+2));   
            }else if (value%2 != 0){
                encryptPass = encryptPass + (char) (value+Math.pow(2, i+1));
            }
        }
        return encryptPass;
    }
    
    public static String decryptPass(String password)
    {
        String invPass = "";
        String decryptPass ="";
        for (int i = 0; i <password.length(); i++) {
            int value = password.codePointAt(i);
            if(value%2 == 0){
               invPass = invPass + (char) (value-Math.pow(2, i+2));   
            }else if (value%2 != 0){
                invPass = invPass + (char) (value-Math.pow(2, i+1));
            }
        }
        
        for (int i = invPass.length()-1; i >=0 ; i--) {
            decryptPass = decryptPass+invPass.charAt(i);
        }
        
        return decryptPass;
    }
}
