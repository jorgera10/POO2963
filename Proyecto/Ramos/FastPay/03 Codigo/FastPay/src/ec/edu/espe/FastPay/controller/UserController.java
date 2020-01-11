package ec.edu.espe.FastPay.controller;


import com.google.gson.Gson;
import ec.edu.espe.FastPay.Library.FileLibrary;
import ec.edu.espe.FastPay.Library.PasswordLibrary;
import ec.edu.espe.FastPay.model.User;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class UserController {
    
    private final Gson gson = new Gson();
    public User Validate(String username, String password){
        ArrayList<Object> objects;
        
        ArrayList<User> users = new ArrayList<>();
        objects = FileLibrary.readObjects(User.class.getSimpleName());
        User user = null;
        for (int i = 0; i < objects.size(); i++) {
            User userJson;
            String jUser = gson.toJson(objects.get(i));
            userJson = gson.fromJson(jUser, User.class);
            
            users.add(userJson);
            
        }
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUserName().equals(username)&&PasswordLibrary.decryptPass(users.get(i).getPassword()).equals(password)){
               user = users.get(i);
            }
        }
        return user;
    }
    
    
}
