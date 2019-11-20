/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.main;


import ec.edu.espe.KeyClassesAndRelationships.model.Account;
import ec.edu.espe.KeyClassesAndRelationships.model.AccountOrNote;
import ec.edu.espe.KeyClassesAndRelationships.model.InformationOwner;
import ec.edu.espe.KeyClassesAndRelationships.model.Note;
import ec.edu.espe.KeyClassesAndRelationships.model.SystemAdminUser;
import ec.edu.espe.KeyClassesAndRelationships.model.TrustFrienndsGroup;
import ec.edu.espe.KeyClassesAndRelationships.model.TrustedFriend;
import ec.edu.espe.KeyClassesAndRelationships.model.User;
import ec.edu.espe.accounts.Comment;
import ec.edu.espe.accounts.Password;
import ec.edu.espe.accounts.PhysicalAccessAccount;
import ec.edu.espe.accounts.Reminders;
import ec.edu.espe.accounts.Username;
import ec.edu.espe.accounts.Web_basedAccount;
import ec.edu.espe.folders.InformationNode;
import ec.edu.espe.folders.RootFolder;
import ec.edu.espe.loginGUI.Form;
import ec.edu.espe.loginGUI.LoginForm;
import ec.edu.espe.password_generator.EndDate;
import ec.edu.espe.password_generator.InformationUser;
import ec.edu.espe.password_generator.PasswordCriteria;
import ec.edu.espe.password_generator.PasswordFragment;
import ec.edu.espe.password_generator.PasswordGenerator;
import ec.edu.espe.password_generator.StartDate;
import ec.edu.espe.user_aunthentication_and_session.SetOfActiveUsers;
import ec.edu.espe.user_aunthentication_and_session.UserSession;
import java.net.Authenticator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class System {
    
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        Account accout = new Account();
        Comment comment = new Comment();
        ComputerNetworkAccount computerNetworkAccount = new ComputerNetworkAccount();
        DesktopApplicationAccount desktopApplicationAccount = new DesktopApplicationAccount();
        Password password = new Password();
        Reminders reminders = new Reminders();
        Username username = new Username();
        Web_basedAccount webBasedAccount = new Web_basedAccount();
        AccountOrNote accountNote = new AccountOrNote();
        InformationNode informationNode = new InformationNode();
        RootFolder rootFolder = new RootFolder(); 
        InformationOwner informationOwner = new InformationOwner();
        Note note = new Note();
        SystemAdminUser systemAdminUser = new SystemAdminUser();
        TrustFrienndsGroup trustFriendGroup = new TrustFrienndsGroup();
        TrustedFriend trustedFriend = new TrustedFriend();
        User user = new User();
        Form form = new Form();
        LoginForm loginForm = new LoginForm();
        EndDate endDate = new EndDate();
        InformationUser informationUser = new InformationUser();
        PasswordCriteria passwordCriteria = new PasswordCriteria();
        PasswordFragment passwordFragment = new PasswordFragment();
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        StartDate startDate = new StartDate();
        SetOfActiveUsers setActiveUser = new SetOfActiveUsers();
        UserSession userSession = new UserSession();
    }
   
}
