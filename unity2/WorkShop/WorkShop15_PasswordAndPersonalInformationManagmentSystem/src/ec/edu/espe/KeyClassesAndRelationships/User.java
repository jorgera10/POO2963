/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.KeyClassesAndRelationships;

/**
 *
 * @author Lenovo
 */
public class User {
    private String user_name;
    private String password;
    private String full_name;
    private String email_adress;
    private boolean is_active;
    
    
    public String check_password(String password){
    this.password = password;
    return password;
} 
    public void get_trust_friends_groups(){
        
    }
    
}
