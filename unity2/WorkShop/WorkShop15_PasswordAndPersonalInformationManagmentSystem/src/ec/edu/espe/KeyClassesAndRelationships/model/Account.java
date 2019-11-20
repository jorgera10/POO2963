/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.KeyClassesAndRelationships.model;

import ec.edu.espe.accounts.*;


import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Account extends AccountOrNote {
    protected Password password;
    protected Username username;
    protected Comment comment;
    protected List<Property> properties;
    protected List<Reminders> reminder;
}
