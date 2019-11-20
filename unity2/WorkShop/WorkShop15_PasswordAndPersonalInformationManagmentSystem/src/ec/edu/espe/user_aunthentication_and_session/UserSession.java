/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.user_aunthentication_and_session;

/**
 *
 * @author Lenovo
 */
public class UserSession {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }
     
     
    public UserSession() {
        user = null;
        user = new User();
    }

    
}
