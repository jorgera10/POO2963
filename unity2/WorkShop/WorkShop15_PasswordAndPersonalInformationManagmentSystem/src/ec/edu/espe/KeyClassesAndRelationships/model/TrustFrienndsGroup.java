/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.KeyClassesAndRelationships.model;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class TrustFrienndsGroup {
    private String  label;
    
    private ArrayList<Account> account;
    public void viewAccounts(){
        
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the account
     */
    public ArrayList<Account> getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(ArrayList<Account> account) {
        this.account = account;
    }
}
